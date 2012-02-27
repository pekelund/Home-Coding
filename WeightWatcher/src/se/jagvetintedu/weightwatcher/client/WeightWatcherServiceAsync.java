package se.jagvetintedu.weightwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface WeightWatcherServiceAsync {

	void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);

}
