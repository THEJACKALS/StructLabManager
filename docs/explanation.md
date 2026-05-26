# Penjelasan Struktur Data

## Ringkasan

Program ini menggunakan `ArrayList<String>` untuk menyimpan data hewan. Struktur data ini cocok untuk latihan dasar karena:

- mudah ditambah dengan `add()`;
- mudah ditampilkan dengan loop sederhana;
- mudah dihapus dengan `removeAll()`;
- cocok untuk data kecil dan latihan konsep koleksi dinamis.

## Data yang Disimpan

Ada dua daftar utama:

1. `animals`
   - berisi data awal hewan;
   - contoh isi: `sapi`, `kelinci`, `kambing`, `unta`, `domba`.

2. `removals`
   - berisi data hewan yang akan dihapus dari daftar utama;
   - contoh isi: `kelinci`, `kambing`, `unta`.

## Operasi Utama

### 1. `add()`
Dipakai saat membentuk data awal dari daftar tetap ke dalam `ArrayList`.

### 2. `removeAll()`
Dipakai untuk menghapus semua elemen pada `animals` yang ada di daftar `removals`.

Secara hasil, daftar awal:

```text
[sapi, kelinci, kambing, unta, domba]
```

akan berubah menjadi:

```text
[sapi, domba]
```

### 3. `isEmpty()` dan `size()`
Dipakai untuk membantu tampilan menu dan validasi sederhana agar program lebih aman ketika data kosong.

## Kenapa `ArrayList`?

`ArrayList` dipilih karena sederhana untuk dipahami dalam konteks tugas Struktur Data dasar. Walau program ini kecil, `ArrayList` sudah cukup untuk menunjukkan konsep koleksi dinamis, penghapusan data, dan pengolahan daftar dalam CLI.

## Catatan Refactor

Kode dipisahkan ke beberapa fungsi kecil supaya setiap bagian punya tanggung jawab jelas:

- membentuk data awal;
- menampilkan menu;
- membaca pilihan user;
- menampilkan daftar;
- memproses penghapusan data.

Pendekatan ini membuat kode lebih mudah dibaca dan lebih mudah dikembangkan tanpa mengubah inti logika tugas lama.
