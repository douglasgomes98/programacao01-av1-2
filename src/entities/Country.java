/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author dougl
 */
public class Country {

    private String name;
    private String capital;
    private Double dimension;
    private ArrayList<Country> border_countries = new ArrayList<>();

    public Country(String name, String capital, Double dimension) {
        this.name = name;
        this.capital = capital;
        this.dimension = dimension;
    }

    public Double getDimension() {
        return dimension;
    }

    public void setDimension(Double dimension) {
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<Country> getBorder_countries() {
        return border_countries;
    }

    public void setBorder_countries(ArrayList<Country> border_countries) {
        this.border_countries = border_countries;
    }

    public boolean addCountryToBorder(Country country) {
        if (country.equals(this)) {
            return false;
        }

        if (this.border_countries.contains(country)) {
            return false;
        }

        this.border_countries.add(country);
        return true;
    }

    public ArrayList<Country> showCountriesEquals(Country country) {
        ArrayList<Country> equals = new ArrayList<>();

        for (int i = 0; i < country.getBorder_countries().size(); i++) {

            if (this.border_countries.contains(country.border_countries.get(i))) {
                equals.add(country.border_countries.get(i));
            }

        }

        return equals;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", capital=" + capital + ", dimension=" + dimension + ", border_countries=" + border_countries + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.capital);
        hash = 89 * hash + Objects.hashCode(this.dimension);
        hash = 89 * hash + Objects.hashCode(this.border_countries);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.capital, other.capital)) {
            return false;
        }
        if (!Objects.equals(this.dimension, other.dimension)) {
            return false;
        }
        return Objects.equals(this.border_countries, other.border_countries);
    }

}
