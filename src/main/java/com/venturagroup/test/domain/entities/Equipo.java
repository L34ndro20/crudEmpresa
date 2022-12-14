package com.venturagroup.test.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "equipos")
public class Equipo {

  @Id
  private Integer id;
  private String codigo_mantenimiento;
  private String nombre;
  private Timestamp fecha_ingreso;
  private Date fecha_regreso_operacion;
  private Date ultima_fecha_mantenimiento;
  private Integer id_tipo_equipo;
  private Integer id_estado_equipo;
  private String id_empresa;
  private String estado;
  private String capacidad;
  private String marca;
  private String modelo;
  private String serial;
  private Integer id_pertinencia_equipos;
  private String id_centro_costos;
  private String id_clasificacion_equipos;


  public Equipo() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCodigo_mantenimiento() {
    return codigo_mantenimiento;
  }

  public void setCodigo_mantenimiento(String codigo_mantenimiento) {
    this.codigo_mantenimiento = codigo_mantenimiento;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Timestamp getFecha_ingreso() {
    return fecha_ingreso;
  }

  public void setFecha_ingreso(Timestamp fecha_ingreso) {
    this.fecha_ingreso = fecha_ingreso;
  }

  public Date getFecha_regreso_operacion() {
    return fecha_regreso_operacion;
  }

  public void setFecha_regreso_operacion(Date fecha_regreso_operacion) {
    this.fecha_regreso_operacion = fecha_regreso_operacion;
  }

  public Date getUltima_fecha_mantenimiento() {
    return ultima_fecha_mantenimiento;
  }

  public void setUltima_fecha_mantenimiento(Date ultima_fecha_mantenimiento) {
    this.ultima_fecha_mantenimiento = ultima_fecha_mantenimiento;
  }

  public Integer getId_tipo_equipo() {
    return id_tipo_equipo;
  }

  public void setId_tipo_equipo(Integer id_tipo_equipo) {
    this.id_tipo_equipo = id_tipo_equipo;
  }

  public Integer getId_estado_equipo() {
    return id_estado_equipo;
  }

  public void setId_estado_equipo(Integer id_estado_equipo) {
    this.id_estado_equipo = id_estado_equipo;
  }

  public String getId_empresa() {
    return id_empresa;
  }

  public void setId_empresa(String id_empresa) {
    this.id_empresa = id_empresa;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(String capacidad) {
    this.capacidad = capacidad;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public Integer getId_pertinencia_equipos() {
    return id_pertinencia_equipos;
  }

  public void setId_pertinencia_equipos(Integer id_pertinencia_equipos) {
    this.id_pertinencia_equipos = id_pertinencia_equipos;
  }

  public String getId_centro_costos() {
    return id_centro_costos;
  }

  public void setId_centro_costos(String id_centro_costos) {
    this.id_centro_costos = id_centro_costos;
  }

  public String getId_clasificacion_equipos() {
    return id_clasificacion_equipos;
  }

  public void setId_clasificacion_equipos(String id_clasificacion_equipos) {
    this.id_clasificacion_equipos = id_clasificacion_equipos;
  }
}
