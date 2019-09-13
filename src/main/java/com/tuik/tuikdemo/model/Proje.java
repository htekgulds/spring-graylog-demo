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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "proje")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Proje implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "proje_seq", sequenceName = "proje_seq", initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proje_seq")
	private Long id;

	@Column(name = "ad")
	private String ad;

	@Column(name = "sema")
	private String sema;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proje", targetEntity = Islem.class, cascade = CascadeType.ALL)
	private Set<Islem> islem;

}
