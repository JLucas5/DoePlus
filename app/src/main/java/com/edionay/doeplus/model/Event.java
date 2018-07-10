package com.edionay.doeplus.model;

import java.io.Serializable;
import java.util.List;

public class Event implements Serializable{

	String title;
	String date;
	String timeStart;
	String timeEnd;
	String location;
	List<String> itens;

	public Event(){

    }

    public Event(String title, String date, String local) {
        this.title = title;
        this.date = date;
        this.location = local;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocal(String local) {
        this.location = location;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }
}
