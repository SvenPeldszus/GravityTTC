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
package org.apache.bcel5_2_0.generic;

/**
 * Super class for stack operations like DUP and POP.
 *
 * @version $Id: StackInstruction.java 1627906 2014-09-26 22:41:39Z ebourg $
 * @author  <A HREF="mailto:m.dahm@gmx.de">M. Dahm</A>
 */
public abstract class StackInstruction extends Instruction {

    private static final long serialVersionUID = -8542057001831958935L;


    /**
     * Empty constructor needed for the Class.newInstance() statement in
     * Instruction.readInstruction(). Not to be used otherwise.
     */
    StackInstruction() {
    }


    /**
     * @param opcode instruction opcode
     */
    protected StackInstruction(short opcode) {
        super(opcode, (short) 1);
    }


    /** @return Type.UNKNOWN
     */
    public Type getType( ConstantPoolGen cp ) {
        return Type.UNKNOWN;
    }
}
