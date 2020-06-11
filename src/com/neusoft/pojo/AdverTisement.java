package com.neusoft.pojo;

public class AdverTisement {
	private int id;
	private String adName;
	private String adLink;
	private String adImg;
	private int adView;
	public AdverTisement() {
		
	}
	public AdverTisement(int id, String adName, String adLink, String adImg, int adView) {
		super();
		this.id = id;
		this.adName = adName;
		this.adLink = adLink;
		this.adImg = adImg;
		this.adView = adView;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdLink() {
		return adLink;
	}
	public void setAdLink(String adLink) {
		this.adLink = adLink;
	}
	public String getAdImg() {
		return adImg;
	}
	public void setAdImg(String adImg) {
		this.adImg = adImg;
	}
	public int getAdView() {
		return adView;
	}
	public void setAdView(int adView) {
		this.adView = adView;
	}
	@Override
	public String toString() {
		return "AdverTisement [id=" + id + ", adName=" + adName + ", adLink=" + adLink + ", adImg=" + adImg
				+ ", adView=" + adView + "]";
	}
}
