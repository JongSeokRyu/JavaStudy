package JavaStudy.BlockChainPract.core;

public class Block {
	
	private int blockID;
	private int nonce;
	private String data;
	public int getBlockID() {
		return blockID;
	}
	public void setBlockID(int blockID) {
		this.blockID = blockID;
	}
	public int getNonce() {
		return nonce;
	}
	public void setNonce(int nonce) {
		this.nonce = nonce;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
