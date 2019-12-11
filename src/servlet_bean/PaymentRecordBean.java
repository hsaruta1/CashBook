package pac1;

import java.io.Serializable;

//データ保持用のJavaBeans(部品が持つ要素をまとめたクラス) - 主に部品に特化した名詞的要素を定義する
public class PaymentRecordBean implements Serializable {

	private int payment;
	private String comment;

	// Constructor
	public PaymentRecordBean() {

	}

    public void setPayment(int payment) {
    	this.payment = payment;
    }

    public int getPayment() {
    	return this.payment;
    }

    public void setComment(String comment) {
    	this.comment = comment;
    }

    public String getComment() {
    	return this.comment;
    }
}
