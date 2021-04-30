package com.webage.ejb.view;

import com.webage.beans.Soup;
import com.webage.ejb.BadCustomerException;

public interface OrderSoupRemote {

	String orderSoup(Soup soup) throws BadCustomerException;

}
