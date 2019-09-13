package com.tuik.tuikdemo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tablo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tablo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "tablo_seq", sequenceName = "tablo_seq", initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tablo_seq")
	private Long id;

	@Column(name = "ad")
	private String ad;

	@Column(name = "sil")
	private boolean sil;

	@Column(name = "guncelle")
	private boolean guncelle;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "islem_id")
	private Islem islem;

}
