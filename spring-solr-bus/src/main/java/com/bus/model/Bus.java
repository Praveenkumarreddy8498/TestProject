package com.bus.model;

import java.sql.Time;
import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;


public class Bus {

	@Field
	private  Integer busId;
	@Field
	private Integer busServiceNum;
	@Field
	private String busPlateNum;
	
	private String busType;
	private String busServiceType;
	private Integer busCapacity;
	private String startingPoint;
	private String destination;
	private Integer busStops;
	private String busRoute;
	private Time busDuration;
	private Date scheduleDepartureDate;
	private Time scheduleDepartureTime;
	private Date scheduleArrivalDate;
	private Time  scheduleArrivalTime;
	private Time estimatedArrivalTime;
	private Double fareAmount;
	private Double fareTax;
	private Double totalFare;
	private Boolean runningStatus;
	public Integer getBusId() {
		return busId;
	}
	public void setBusId(Integer busId) {
		this.busId = busId;
	}
	public Integer getBusServiceNum() {
		return busServiceNum;
	}
	public void setBusServiceNum(Integer busServiceNum) {
		this.busServiceNum = busServiceNum;
	}
	public String getBusPlateNum() {
		return busPlateNum;
	}
	public void setBusPlateNum(String busPlateNum) {
		this.busPlateNum = busPlateNum;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusServiceType() {
		return busServiceType;
	}
	public void setBusServiceType(String busServiceType) {
		this.busServiceType = busServiceType;
	}
	public Integer getBusCapacity() {
		return busCapacity;
	}
	public void setBusCapacity(Integer busCapacity) {
		this.busCapacity = busCapacity;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getBusStops() {
		return busStops;
	}
	public void setBusStops(Integer busStops) {
		this.busStops = busStops;
	}
	public String getBusRoute() {
		return busRoute;
	}
	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}
	public Time getBusDuration() {
		return busDuration;
	}
	public void setBusDuration(Time busDuration) {
		this.busDuration = busDuration;
	}
	public Date getScheduleDepartureDate() {
		return scheduleDepartureDate;
	}
	public void setScheduleDepartureDate(Date scheduleDepartureDate) {
		this.scheduleDepartureDate = scheduleDepartureDate;
	}
	public Time getScheduleDepartureTime() {
		return scheduleDepartureTime;
	}
	public void setScheduleDepartureTime(Time scheduleDepartureTime) {
		this.scheduleDepartureTime = scheduleDepartureTime;
	}
	public Date getScheduleArrivalDate() {
		return scheduleArrivalDate;
	}
	public void setScheduleArrivalDate(Date scheduleArrivalDate) {
		this.scheduleArrivalDate = scheduleArrivalDate;
	}
	public Time getScheduleArrivalTime() {
		return scheduleArrivalTime;
	}
	public void setScheduleArrivalTime(Time scheduleArrivalTime) {
		this.scheduleArrivalTime = scheduleArrivalTime;
	}
	public Time getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}
	public void setEstimatedArrivalTime(Time estimatedArrivalTime) {
		this.estimatedArrivalTime = estimatedArrivalTime;
	}
	public Double getFareAmount() {
		return fareAmount;
	}
	public void setFareAmount(Double fareAmount) {
		this.fareAmount = fareAmount;
	}
	public Double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}
	public Double getFareTax() {
		return fareTax;
	}
	public void setFareTax(Double fareTax) {
		this.fareTax = fareTax;
	}
	public Boolean getRunningStatus() {
		return runningStatus;
	}
	public void setRunningStatus(Boolean runningStatus) {
		this.runningStatus = runningStatus;
	}
	
	
	

	
}
