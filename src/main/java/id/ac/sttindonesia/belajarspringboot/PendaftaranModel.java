package id.ac.sttindonesia.belajarspringboot;

import java.sql.Date;

public class PendaftaranModel
{
  private String NamaMahasiswa;
  private String TempatLahir;
  private Date  TanggalLahir;

  public void setNamaMahasiswa(String NamaMahasiswa)
  {
    this.NamaMahasiswa = NamaMahasiswa;
  }
  public String getNamaMahasiswa()
  {
    return this.NamaMahasiswa;
  }
  
  public void setTempatLahir(String TempatLahir)
  {
    this.TempatLahir = TempatLahir;
  }
  public String getTempatLahir()
  {
    return this.TempatLahir;
  }

  public void setTanggalLahir(Date TanggalLahir)
  {
    this.TanggalLahir = TanggalLahir;
  }
  public Date getTanggalLahir()
  {
    return this.TanggalLahir;
  }
  
  @Override
  public String toString()
  {
    return "Pendaftaran [Nama Mahasiswa = " + this.NamaMahasiswa + 
          ", Tempat Lahir = " + this.TempatLahir +  
          ", Tanggal Lahir = " + this.TanggalLahir;
  }
}