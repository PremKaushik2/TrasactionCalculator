package com.prem.statistics.service;

import com.prem.domain.Statistic;
import com.prem.domain.Transaction;

public interface StatisticService {
	
	
	void processTransaction(Transaction transaction);

    Statistic getStatistic();

}
