/*
 * File:                AbstractSufficientStatistic.java
 * Authors:             Kevin R. Dixon
 * Company:             Sandia National Laboratories
 * Project:             Cognitive Foundry
 * 
 * Copyright Mar 2, 2011, Sandia Corporation.
 * Under the terms of Contract DE-AC04-94AL85000, there is a non-exclusive
 * license for use of this work by or on behalf of the U.S. Government.
 * Export of this program may require a license from the United States
 * Government. See CopyrightHistory.txt for complete details.
 * 
 */

package gov.sandia.cognition.statistics;

import gov.sandia.cognition.util.AbstractCloneableSerializable;

/**
 * Partial implementation of SufficientStatistic
 * @param <DataType>
 * Type of data generated by the Distribution
 * @param <DistributionType>
 * Type of Distribution this is the sufficient statistics of
 * @author Kevin R. Dixon
 * @since 3.1
 */
public abstract class AbstractSufficientStatistic<DataType, DistributionType>// extends Distribution<? extends DataType>>
    extends AbstractCloneableSerializable
    implements SufficientStatistic<DataType, DistributionType>
{

    /**
     * Number of data points used to create this SufficientStatistic
     */
    protected long count;

    /** 
     * Creates a new instance of AbstractSufficientStatistic
     */
    public AbstractSufficientStatistic()
    {
        super();
        this.setCount(0);
    }

    @Override
    @SuppressWarnings("unchecked")
    public AbstractSufficientStatistic<DataType, DistributionType> clone()
    {
        return (AbstractSufficientStatistic<DataType, DistributionType>) super.clone();
    }

    @Override
    public void update(
        final Iterable<? extends DataType> values)
    {
        for( DataType value : values )
        {
            this.update( value );
        }
    }

    @Override
    public long getCount()
    {
        return this.count;
    }

    /**
     * Setter for count
     * @param count
     * Number of data points used to create this SufficientStatistic
     */
    protected void setCount(
        final long count)
    {
        this.count = count;
    }

}
