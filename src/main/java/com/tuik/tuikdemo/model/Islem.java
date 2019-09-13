package com.tuik.tuikdemo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "islem")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Islem implements Serializable {

	private static final long serialVersionUID = 8632149289168965164L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "islem_seq", sequenceName = "islem_seq", initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "islem_seq")
	private Long id;

	@Column(name = "ad")
	private String ad;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "islem", targetEntity = Tablo.class, cascade = CascadeType.ALL)
	private Set<Tablo> tablo;

	@JsonIgnore()
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proje_Id")
	private Proje proje;

}
