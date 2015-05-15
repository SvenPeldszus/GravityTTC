/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.bcel.classfile;

import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.bcel.Constants;

/**
 * This class represents a stack map attribute used for
 * preverification of Java classes for the <a
 * href="http://java.sun.com/j2me/"> Java 2 Micro Edition</a>
 * (J2ME). This attribute is used by the <a
 * href="http://java.sun.com/products/cldc/">KVM</a> and contained
 * within the Code attribute of a method. See CLDC specification
 * ��?5.3.1.2
 *
 * @version $Id: StackMapTable.java 1663628 2015-03-03 10:56:38Z ebourg $
 * @author  <A HREF="mailto:m.dahm@gmx.de">M. Dahm</A>
 * @see     Code
 * @see     StackMapEntry
 * @see     StackMapType
 * @since 6.0
 */
public final class StackMapTable extends Attribute {

    private static final long serialVersionUID = -5802191977296683162L;
    private StackMapTableEntry[] map; // Table of stack map entries


    /*
     * @param name_index Index of name
     * @param length Content length in bytes
     * @param map Table of stack map entries
     * @param constant_pool Array of constants
     */
    public StackMapTable(int name_index, int length, StackMapTableEntry[] map, ConstantPool constant_pool) {
        super(Constants.ATTR_STACK_MAP_TABLE, name_index, length, constant_pool);
        setStackMapTable(map);
    }


    /**
     * Construct object from file stream.
     * @param name_index Index of name
     * @param length Content length in bytes
     * @param file Input stream
     * @param constant_pool Array of constants
     * @throws IOException
     */
    StackMapTable(int name_index, int length, DataInput file, ConstantPool constant_pool) throws IOException {
        this(name_index, length, (StackMapTableEntry[]) null, constant_pool);
        int map_length = file.readUnsignedShort();
        map = new StackMapTableEntry[map_length];
        for (int i = 0; i < map_length; i++) {
            map[i] = new StackMapTableEntry(file, constant_pool);
        }
    }


    /**
     * Dump line number table attribute to file stream in binary format.
     *
     * @param file Output file stream
     * @throws IOException
     */
    @Override
    public final void dump( DataOutputStream file ) throws IOException {
        super.dump(file);
        file.writeShort(map.length);
        for (StackMapTableEntry entry : map) {
            entry.dump(file);
        }
    }


    /**
     * @return Array of stack map entries
     */
    public final StackMapTableEntry[] getStackMapTable() {
        return map;
    }


    /**
     * @param map Array of stack map entries
     */
    public final void setStackMapTable( StackMapTableEntry[] map ) {
        this.map = map;
    }


    /**
     * @return String representation.
     */
    @Override
    public final String toString() {
        StringBuilder buf = new StringBuilder("StackMapTable(");
        for (int i = 0; i < map.length; i++) {
            buf.append(map[i].toString());
            if (i < map.length - 1) {
                buf.append(", ");
            }
        }
        buf.append(')');
        return buf.toString();
    }


    /**
     * @return deep copy of this attribute
     */
    @Override
    public Attribute copy( ConstantPool _constant_pool ) {
        StackMapTable c = (StackMapTable) clone();
        c.map = new StackMapTableEntry[map.length];
        for (int i = 0; i < map.length; i++) {
            c.map[i] = map[i].copy();
        }
        c.constant_pool = _constant_pool;
        return c;
    }


    /**
     * Called by objects that are traversing the nodes of the tree implicitely
     * defined by the contents of a Java class. I.e., the hierarchy of methods,
     * fields, attributes, etc. spawns a tree of objects.
     *
     * @param v Visitor object
     */
    @Override
    public void accept( Visitor v ) {
        v.visitStackMapTable(this);
    }


    public final int getMapLength() {
        return map == null ? 0 : map.length;
    }
}