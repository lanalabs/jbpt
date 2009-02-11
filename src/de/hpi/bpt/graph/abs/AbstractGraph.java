/**
 * Copyright (c) 2008 Artem Polyvyanyy
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.hpi.bpt.graph.abs;

import java.util.ArrayList;
import java.util.Collection;

import de.hpi.bpt.hypergraph.abs.IVertex;

/**
 * Graph implementation
 * 
 * @author Artem Polyvyanyy
 *
 * @param <E> template for edge (extends IEdge)
 * @param <V> template for vertex (extends IVertex)
 */
public class AbstractGraph<E extends IEdge<V>,V extends IVertex> extends AbstractMultiGraph<E,V>
{	
	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.graph.abs.AbstractMultiGraph#addEdge(de.hpi.bpt.hypergraph.abs.IVertex, de.hpi.bpt.hypergraph.abs.IVertex)
	 */
	@Override
	public E addEdge(V v1, V v2) {
		Collection<V> vs = new ArrayList<V>();
		vs.add(v1); vs.add(v2);
		
		if (!this.checkEdge(vs)) return null;
		
		return super.addEdge(v1, v2);
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.hpi.bpt.graph.abs.AbstractMultiGraph#isMultiGraph()
	 */
	@Override
	public boolean isMultiGraph() {
		return false;
	}
}
