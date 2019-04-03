package com.example.pdamapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name ="tbl_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "ID")
	private Integer id;
	
	@Column (name = "KODE_PDAM")
	private String kodePdam;
	
	@Column (name = "NIK")
	private String nik;
	
	@Column (name = "USERNAME")
	private String username;
	
	@Column (name = "PASSWORD")
	private String password;
	
	@Column (name = "AVATAR")
	private String avatar;
	
	@Column (name = "LEVEL_USER")
	private Integer levelUser;
	
	@Column (name = "STATUS")
	private Integer statis;
	
	@Column (name = "DEVICE_ID")
	private String deviceId;	
	
	@Column (name = "CREATE_AT")
	@Temporal (TemporalType.TIMESTAMP)
	private Date createAt;
	
	@Column (name = "UPDATE_AT")
	@Temporal (TemporalType.TIMESTAMP)
	private Date updateAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKodePdam() {
		return kodePdam;
	}

	public void setKodePdam(String kodePdam) {
		this.kodePdam = kodePdam;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getLevelUser() {
		return levelUser;
	}

	public void setLevelUser(Integer levelUser) {
		this.levelUser = levelUser;
	}

	public Integer getStatis() {
		return statis;
	}

	public void setStatis(Integer statis) {
		this.statis = statis;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	
}
