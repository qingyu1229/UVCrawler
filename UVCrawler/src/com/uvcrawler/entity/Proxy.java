package com.uvcrawler.entity;

public class Proxy {
	
	/**
	 * 代理主机
	 */
	private String proxyHost;
	/**
	 * 端口
	 */
	private int proxyPort;
	/**
	 * 用户名
	 */
	private String proxyUsername ;
	/**
	 * 密码
	 */
	private String proxyPassword ;
	/**
	 * 响应时间（ms）
	 */
	private int response_time;
	/**
	 * 是否可用
	 */
	private boolean available;
	
	public String getProxyHost() {
		return proxyHost;
	}
	public void setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
	}
	public int getProxyPort() {
		return proxyPort;
	}
	public void setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
	}
	public String getProxyUsername() {
		return proxyUsername;
	}
	public void setProxyUsername(String proxyUsername) {
		this.proxyUsername = proxyUsername;
	}
	public String getProxyPassword() {
		return proxyPassword;
	}
	public void setProxyPassword(String proxyPassword) {
		this.proxyPassword = proxyPassword;
	}
	public int getResponse_time() {
		return response_time;
	}
	public void setResponse_time(int response_time) {
		this.response_time = response_time;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}
