CREATE TABLE pembeli(
  pb_id CHAR(5) PRIMARY KEY NOT NULL,
  pb_nama VARCHAR(100),
  pb_email VARCHAR(30),
  pb_nohp INTEGER
);

CREATE TABLE penjual(
  pj_id CHAR(5) PRIMARY KEY NOT NULL,
  pj_nama VARCHAR(100),
  pj_email VARCHAR(30),
  pj_nohp INTEGER,
  pj_alamat VARCHAR(150)
);

CREATE TABLE login(
  username VARCHAR(15) PRIMARY KEY NOT NULL,
  pj_id CHAR(5),
  pb_id CHAR(5),
  PASSWORD CHAR(16),
  CONSTRAINT fk_pj_login FOREIGN KEY (pj_id) REFERENCES penjual(pj_id),
  CONSTRAINT fk_pb_login FOREIGN KEY (pb_id) REFERENCES pembeli(pb_id)
);

CREATE TABLE pembayaran(
  pm_id CHAR(16) PRIMARY KEY NOT NULL,
  pm_opsibayar VARCHAR(15),
  pm_opsikirim VARCHAR(15)
);

CREATE TABLE keranjang(
  k_id CHAR(5) PRIMARY KEY NOT NULL,
  pm_id CHAR(16),
  CONSTRAINT fk_k_pm FOREIGN KEY (pm_id) REFERENCES pembayaran(pm_id)
);

CREATE TABLE detail_keranjang(
  k_id CHAR(5),
  jumlah_barang INTEGER,
  alamat VARCHAR(300),
  total_bayar NUMERIC(8,2),
  CONSTRAINT fk_k_dk FOREIGN KEY (k_id) REFERENCES keranjang(k_id)
);

CREATE TABLE kategori(
  c_id CHAR(10) PRIMARY KEY NOT NULL,
  c_nama VARCHAR(20)
);

CREATE TABLE produk(
  pd_id CHAR(5) PRIMARY KEY NOT NULL,
  pj_id CHAR(5),
  c_id CHAR(10),
  pd_nama VARCHAR(100),
  pd_brand VARCHAR(15),
  pd_gambar BLOB,
  pd_harga NUMERIC(8,2),
  pd_desk LONG VARCHAR,
  CONSTRAINT fk_pj_pd FOREIGN KEY (pj_id) REFERENCES penjual(pj_id),
  CONSTRAINT fk_c_pd FOREIGN KEY (c_id) REFERENCES kategori(c_id)
);

INSERT INTO login VALUES(1, 'admin')
