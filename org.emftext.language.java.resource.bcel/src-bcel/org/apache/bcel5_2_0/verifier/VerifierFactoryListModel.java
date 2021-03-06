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
package org.apache.bcel5_2_0.verifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/**
 * This class implements an adapter; it implements both a Swing ListModel and
 * a VerifierFactoryObserver.
 *
 * @version $Id: VerifierFactoryListModel.java 1627977 2014-09-27 15:16:23Z ggregory $
 * @author Enver Haase
 */
public class VerifierFactoryListModel implements org.apache.bcel5_2_0.verifier.VerifierFactoryObserver,
        javax.swing.ListModel {

    private final List<ListDataListener> listeners = new ArrayList<ListDataListener>();
    private final Set<String> cache = new TreeSet<String>();


    public VerifierFactoryListModel() {
        VerifierFactory.attach(this);
        update(null); // fill cache.
    }


    public synchronized void update( String s ) {
        Verifier[] verifiers = VerifierFactory.getVerifiers();
        int num_of_verifiers = verifiers.length;
        cache.clear();
        for (Verifier verifier : verifiers) {
            cache.add(verifier.getClassName());
        }
        for (ListDataListener listener : listeners) {
            ListDataEvent e = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, num_of_verifiers - 1);
            listener.contentsChanged(e);
        }
    }


    public synchronized void addListDataListener( ListDataListener l ) {
        listeners.add(l);
    }


    public synchronized void removeListDataListener( javax.swing.event.ListDataListener l ) {
        listeners.remove(l);
    }


    public synchronized int getSize() {
        return cache.size();
    }


    public synchronized Object getElementAt( int index ) {
        return (cache.toArray(new String[cache.size()]))[index];
    }
}
