CREATE TABLE pembeli(
	pb_id INT,
	pb_nama VARCHAR(100),
	pb_alamat_pengiriman VARCHAR(100),
);

CREATE TABLE penjual(
	pn_id INT,
	pn_nama VARCHAR(100),
);

CREATE TABLE produk(
	pr_id INT,
	pr_nama VARCHAR(100),
	pr_harga INT,
	pr_qty INT,
	pr_gambar BLOB,
);