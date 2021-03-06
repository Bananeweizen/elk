/*******************************************************************************
 * Copyright (c) 2016 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.layered.options;

/**
 * Which strategy should be used by the
 * {@link org.eclipse.elk.alg.layered.compaction.oned.OneDimensionalCompactor OneDimensionalCompactor} to calculate the
 * constraint graph.
 * 
 * @see org.eclipse.elk.alg.layered.compaction.oned.algs.QuadraticConstraintCalculation QuadraticConstraintCalculation
 * @see org.eclipse.elk.alg.layered.compaction.oned.algs.ScanlineConstraintCalculator ScanlineConstraintCalculator
 */
public enum ConstraintCalculationStrategy {

    /**
     * Determine constraints by a pair-wise comparison of all elements.
     */
    QUADRATIC,

    /** 
     * Use a scanline technique.
     */
    SCANLINE
}
