CREATE TABLE pembeli(
	pb_id INT PRIMARY KEY,
	pb_nama VARCHAR(100),
	pb_alamat_pengiriman VARCHAR(100),
	lg_id INT,
	CONSTRAINT pk_lg_id FOREIGN KEY (lg_id)	REFERENCES login
);

CREATE TABLE penjual(
	pn_id INT PRIMARY KEY,
	pn_nama VARCHAR(100),
	lg_id INT,
	CONSTRAINT pk_lg_id FOREIGN KEY (lg_id)	REFERENCES login
);

CREATE TABLE produk(
	pr_id INT,
	pr_nama VARCHAR(100),
	pr_harga INT,
	pr_qty INT,
	pr_gambar BLOB,
	PRIMARY KEY(pr_id)
);

CREATE TABLE login(
	lg_id INT,
	lg_uname VARCHAR(100),
	lg_pwd VARCHAR(100),
	PRIMARY KEY(lg_id)
);