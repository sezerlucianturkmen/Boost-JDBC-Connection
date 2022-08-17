package com.boost.repository.entity;

public class Musteri {

	private int id;
	private String ad;
	private String soyad;
	private String telefon;
	private int durum;

	public Musteri() {
		super();
	}

	public Musteri(int id, String ad, String soyad, String telefon, int durum) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.durum = durum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public int getDurum() {
		return durum;
	}

	public void setDurum(int durum) {
		this.durum = durum;
	}

	@Override
	public String toString() {
		return "Musteri [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", telefon=" + telefon + ", durum=" + durum
				+ "]";
	}

}
