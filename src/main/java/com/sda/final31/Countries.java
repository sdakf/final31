package com.sda.final31;

import lombok.Getter;

@Getter
public enum Countries {
    POLAND("Polska","PL"),
    UKRAINE("Ukraina", "UA"),
    USA("Stany Zjednoczone Ameryki Północnej", "US"),
    AUSTRALIA("Australia", "AUA");

    private final String polishName;
    private final String symbol;

    Countries(String polishName, String symbol) {
        this.polishName = polishName;
        this.symbol = symbol;
    }
}
