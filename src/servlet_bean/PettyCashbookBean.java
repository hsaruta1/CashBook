package pac1;

import java.io.Serializable;
import java.util.ArrayList;

public class PettyCashbookBean implements Serializable {
	private ArrayList<PaymentRecordBean> paymentHistoryArray = new ArrayList<PaymentRecordBean>();
    public int count = 0;
	// Constructor
	public PettyCashbookBean() {

	}

	public ArrayList<PaymentRecordBean> getPaymentHistoryArray() {
		return paymentHistoryArray;
	}

	public void addPaymentHistoryArray(PaymentRecordBean obj) {
		paymentHistoryArray.add(obj);
	}

	public int getTotalPayment() {
		int totalPayment = 0;
		for(PaymentRecordBean array : paymentHistoryArray) {
			totalPayment = totalPayment + array.getPayment();
		}
		return totalPayment;
	}
}
