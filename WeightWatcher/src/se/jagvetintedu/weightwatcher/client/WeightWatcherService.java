package se.jagvetintedu.weightwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("stockPrices")
public interface WeightWatcherService extends RemoteService {

  StockPrice[] getPrices(String[] symbols);

  StockPrice[] setWeight(Double weight);

}