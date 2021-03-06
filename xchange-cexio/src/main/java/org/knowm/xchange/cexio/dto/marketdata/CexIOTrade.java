package org.knowm.xchange.cexio.dto.marketdata;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Author: brox Since: 2/5/14
 */
public class CexIOTrade {

  private final BigDecimal amount;
  private final BigDecimal price;
  private final long date;
  private final long tid;

  /**
   * Constructor
   * 
   * @param amount
   * @param price
   * @param date
   * @param tid
   */
  public CexIOTrade(@JsonProperty("amount") BigDecimal amount, @JsonProperty("price") BigDecimal price, @JsonProperty("date") long date,
      @JsonProperty("tid") long tid) {

    this.price = price;
    this.amount = amount;
    this.tid = tid;
    this.date = date;
  }

  public BigDecimal getAmount() {

    return amount;
  }

  public long getDate() {

    return date;
  }

  public BigDecimal getPrice() {

    return price;
  }

  public long getTid() {

    return tid;
  }

  @Override
  public String toString() {

    return "CexIOTrade [amount=" + amount + ", price=" + price + ", date=" + date + ", tid=" + tid + "]";
  }

}
