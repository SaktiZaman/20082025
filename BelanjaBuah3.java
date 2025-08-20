import java.util.ArrayList;
import java.util.Scanner;

class Fruit {
    String name;
    double price;
    int stock;
            
    Fruit(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    };
};

class Cart {
    Fruit fruit;
    int cartTagalog;
    int demand;

    Cart(Fruit fruit, int cartTagalog, int demand) {
        this.fruit = fruit;
        this.cartTagalog = cartTagalog;
        this.demand = demand;
    };
};

class diskon {
    String diskonName;
    double minDiskon;
    double diskonValue;

    diskon(String diskonName, double minDiskon, double diskonValue) {
        this.diskonName = diskonName;
        this.minDiskon = minDiskon;
        this.diskonValue = diskonValue;
    }
};

public class BelanjaBuah3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Fruit> AvailableFruits = new ArrayList<>();
        ArrayList<Cart> CurrentCart = new ArrayList<>();
        ArrayList<diskon> AvailableDiskon = new ArrayList<>();
            AvailableFruits.add(new Fruit("mangoe", 50000, 10));
            AvailableDiskon.add(new diskon("Diskon 17 Agustus", 100000, 0.1));
        double total = 0;
        double FinalUnit = 0, bayar, kembalian, diskon, Final = 0;
        int a, user;
        boolean jalan = true;
        boolean penjual;
        boolean pembeli;
        boolean penjual1, penjual2, penjual3, penjual4, penjual5;
        boolean pembeli1, pembeli2, pembeli1dot1, pembeli2dot1, kurang;
        int actionPenjual;
        int actionPembeli;
        int actionPembeli1;
        int actionPembeli2;
        int actionPembeli2dot1;
while (jalan == true) {
        System.out.println("==================");
        System.out.println("Selamat datang di toko Sakti");
        System.out.println("klik 1 untuk penjual, klik 2 untuk pembeli, klik lainya untuk exit");
        user = input.nextInt();
        System.out.println("==================");
    
        if (user == 1) {
            penjual = true;
            while (penjual == true) {
                System.out.println("==================");
                System.out.println("Berhasil Login sebagai penjual");
                System.out.println("==================");
                System.out.println("Stock saat ini");
            for(a = 0; a < AvailableFruits.size(); a++){
                System.out.println("Name: " + AvailableFruits.get(a).name + " Stock: " + AvailableFruits.get(a).stock + " Harga : " + AvailableFruits.get(a).price);
                };
                System.out.println("==================");
                System.out.println("apa yang ingin anda lakukan?");
                System.out.println("klik 1 untuk menambah item baru");
                System.out.println("klik 2 untuk mengubah nama item lama");
                System.out.println("klik 3 untuk mengubah harga item lama");
                System.out.println("klik 4 untuk mengubah stock item lama");
                System.out.println("klik 5 untuk menghapus item lama");
                System.out.println("klik lainnya untuk log out");
                actionPenjual = input.nextInt();
                if (actionPenjual == 1 ){
                    penjual1 = true;
                    while (penjual1 == true) {
                        System.out.println("Menambahkan item baru selcted");
                        System.out.println("==================");
                        System.out.println("Masukkan nama item baru");
                        String newName = input.next();
                        System.out.println("Item " + newName + " created");
                        System.out.println("==================");
                        System.out.println("Masukkan harga item baru");
                        double newHarga = input.nextDouble();
                        System.out.println("==================");
                        System.out.println("Harga item baru set to " + newHarga);
                        System.out.println("==================");
                        System.out.println("Masukkan jumlah stock " + newName);
                        int newStock = input.nextInt();

                        Fruit newFruit = new Fruit(newName, newHarga, newStock);
                        AvailableFruits.add(newFruit);
                        System.out.println("==================");
                        System.out.println("Berhasil menambahkan item " + newName);
                        penjual1 = false;
                    }
                } else if(actionPenjual == 2){
                    penjual2 = true;
                    while (penjual2 == true) {
                        System.out.println("==================");
                        for(a = 0; a < AvailableFruits.size(); a++){
                            System.out.println("(" + a +")" + AvailableFruits.get(a).name);
                    };
                        System.out.println("==================");
                        System.out.println("nama item tagalog mana yang mau anda ubah");
                        int newTagalog = input.nextInt();
                        System.out.println("==================");
                        System.out.println("Masukkan nama baru");
                        AvailableFruits.get(newTagalog).name = input.next();
                        System.out.println("==================");
                        System.out.println("Updated name");
                        penjual2 = false;
                };
                } else if (actionPenjual == 3) {
                    penjual3 = true;
                    while (penjual3 == true) {
                        System.out.println("==================");
                        for(a = 0; a < AvailableFruits.size(); a++){
                        System.out.println("(" + a +")" + AvailableFruits.get(a).name + ": " + AvailableFruits.get(a).price);
                    };
                        System.out.println("==================");
                        System.out.println("Harga item tagalog mana yang mau anda ubah");
                        int newTagalog = input.nextInt();
                        System.out.println("==================");
                        System.out.println("Masukkan harga baru");
                        AvailableFruits.get(newTagalog).price = input.nextDouble();
                        System.out.println("==================");
                        System.out.println("Updated harga");
                        penjual3 = false;
                    }
                } else if (actionPenjual == 4) {
                    penjual4 = true;
                    while (penjual4 == true) {
                        System.out.println("==================");
                        for(a = 0; a < AvailableFruits.size(); a++){
                        System.out.println("(" + a +")" + AvailableFruits.get(a).name + ": " + AvailableFruits.get(a).stock);
                    };
                        System.out.println("==================");
                        System.out.println("Stock item tagalog mana yang mau anda ubah");
                        int newTagalog = input.nextInt();
                        System.out.println("==================");
                        System.out.println("Masukkan stock baru");
                        AvailableFruits.get(newTagalog).stock = input.nextInt();
                        System.out.println("==================");
                        System.out.println("Updated stock");
                        penjual4 = false;
                    }
                } else if (actionPenjual == 5) {
                    penjual5 = true;
                    while (penjual5 == true) {
                        System.out.println("==================");
                        for(a = 0; a < AvailableFruits.size(); a++){
                        System.out.println("(" + a +")" + AvailableFruits.get(a).name + " Harga: " + AvailableFruits.get(a).price + "Stock: " + AvailableFruits.get(a).stock);
                    };
                        System.out.println("==================");
                        System.out.println("Item tagalog mana yang mau anda hapus");
                        int newTagalog = input.nextInt();
                        AvailableFruits.remove(newTagalog);
                        penjual5 = false;
                    }
                } else {
                    penjual = false;
                };
                
            };


        } else if (user == 2) {
            pembeli = true;
            while (pembeli == true) {
                System.out.println("==================");
                System.out.println("Berhasil Login sebagai pembeli");
                System.out.println("klik 1 untuk melihat item available di Toko");
                System.out.println("klik 2 untuk melihat cart");
                System.out.println("klik lainnya untuk keluar");
                actionPembeli = input.nextInt();
                if (actionPembeli == 1) {
                    pembeli1 = true;
                    while (pembeli1 == true) {
                        System.out.println("==================");
                        System.out.println("Item yang tersedia");
                        for(a = 0; a < AvailableFruits.size(); a++){
                            System.out.println("Name: " + AvailableFruits.get(a).name + " Stock: " + AvailableFruits.get(a).stock + " Harga : " + AvailableFruits.get(a).price);
                        }
                        System.out.println("==================");
                        System.out.println("klik 1 untuk menambah product ke cart");
                        System.out.println("klik 2 untuk kembali");
                        actionPembeli1 = input.nextInt();
                        if (actionPembeli1 == 2) {
                            pembeli1 = false;
                        } else if (actionPembeli1 == 1) {
                            pembeli1dot1 = true;
                            while (pembeli1dot1 == true) {
                                System.out.println("Cart: ");
                                for(a = 0; a < CurrentCart.size(); a++){
                                    System.out.println("(" + CurrentCart.get(a).cartTagalog + ")" + "Name: " + AvailableFruits.get(CurrentCart.get(a).cartTagalog).name + " Stock: " + AvailableFruits.get(CurrentCart.get(a).cartTagalog).stock + " Harga : " + AvailableFruits.get(a).price);
                                }

                                System.out.println("==================");
                                System.out.println("item mana yang ingin anda tambahkan ke cart");
                                for(a = 0; a < AvailableFruits.size(); a++){
                                    System.out.println("(" + a +") " + AvailableFruits.get(a).name + " Harga: " + AvailableFruits.get(a).price + " Stock: " + AvailableFruits.get(a).stock);
                                };
                                int addItemTagalog = input.nextInt();
                                System.out.println("==================");
                                System.out.println("Masukkan jumlah " + AvailableFruits.get(addItemTagalog).name + " yang ingin anda beli");
                                int addItemDemand = input.nextInt();
                                if (addItemDemand > AvailableFruits.get(addItemTagalog).stock) {
                                    System.out.println("==================");
                                    System.out.println("Not Enough in stock");
                                    System.out.println("==================");
                                } else {
                                    AvailableFruits.get(addItemTagalog).stock -= addItemDemand;
                                    Cart NewCart = new Cart(AvailableFruits.get(addItemTagalog), addItemTagalog, addItemDemand);
                                    CurrentCart.add(NewCart);
                                    System.out.println("==================");
                                    System.out.println("Berhasil menambahkan item ke cart");
                                    System.out.println("==================");
                                    System.out.println("Cart: ");
                                    for(a = 0; a < CurrentCart.size(); a++){
                                        System.out.println("item number " + a + " " + CurrentCart.get(a).fruit.name + " Harga: " + CurrentCart.get(a).fruit.price + " Demand: " + CurrentCart.get(a).demand);
                                    };
                                }
                                pembeli1dot1 = false;
                            }
                            
                        }

                    }
                } else if (actionPembeli == 2) {
                    pembeli2 = true;
                    while (pembeli2 == true) {
                        System.out.println("==================");
                        System.out.println("Cart: ");
                        for(a = 0; a < CurrentCart.size(); a++){
                            System.out.println("item number " + a + " " + CurrentCart.get(a).fruit.name + " Harga: " + CurrentCart.get(a).fruit.price + " Demand: " + CurrentCart.get(a).demand);
                        }
                        System.out.println("==================");
                        System.out.println("klik angka 1 untuk check out, klik angka lainnya untuk keluar");
                        actionPembeli2 = input.nextInt();
                        if (actionPembeli2 == 1) {
                            pembeli2dot1 = true;
                                FinalUnit = 0;
                                total = 0;
                                diskon = 0;
                                Final = total;
                                for(a = 0; a < CurrentCart.size(); a++){
                                    FinalUnit += CurrentCart.get(a).demand;
                                }
                                for(a = 0; a < CurrentCart.size(); a++){
                                    total += (CurrentCart.get(a).demand * CurrentCart.get(a).fruit.price);
                                }
                            while (pembeli2dot1) {
                                System.out.println("==================");
                                System.out.println("Pembayaran cart");
                                for(a = 0; a < CurrentCart.size(); a++){
                                    System.out.println("item number " + a + " " + CurrentCart.get(a).fruit.name + " " + CurrentCart.get(a).fruit.price + " X " + CurrentCart.get(a).demand);
                                }
                                System.out.println("==================");
                                System.out.println("unit: " + FinalUnit);
                                System.out.println("Final: " + Final);
                                System.out.println("==================");
                                boolean diskonFound = false;
                                for(a = 0; a < AvailableDiskon.size(); a++){
                                    if (AvailableDiskon.get(a).minDiskon <= total) {
                                    diskonFound = true;
                                    }
                                }
                                if (diskonFound == true) {
                                    System.out.println("==================");
                                    System.out.println("Ada Diskon yang tersedia");
                                    System.out.println("==================");
                                    System.out.println("klik 1 untuk pilih salah satu Diskon yang tersedia, klik lainnya untuk lanjut tanpa diskon: ");
                                    int diskonAction = input.nextInt();
                                    if (diskonAction == 1) {
                                        System.out.println("==================");
                                        System.out.println("Diskon yang tersedia");
                                        System.out.println("==================");
                                        for(a = 0; a < AvailableDiskon.size(); a++){
                                            System.out.println("diskon number " + a + " " + AvailableDiskon.get(a).diskonName + " Minimal pembayaraan: " 
                                            + AvailableDiskon.get(a).minDiskon + " Potongan: " + (AvailableDiskon.get(a).diskonValue * 100));
                                        }
                                        System.out.println("==================");
                                        System.out.println("Masukkan diskon yang ingin dipilih");
                                        int chosenDiskon = input.nextInt();
                                        diskon = AvailableDiskon.get(chosenDiskon).diskonValue;
                                    }
                                    Final = total - (total * diskon);
                                    System.out.println("==================");
                                    System.out.println("Pembayaran cart");
                                    for(a = 0; a < CurrentCart.size(); a++){
                                        System.out.println("item number " + a + " " + CurrentCart.get(a).fruit.name + " " + CurrentCart.get(a).fruit.price + " X " + CurrentCart.get(a).demand);
                                    }
                                    System.out.println("==================");
                                    System.out.println("unit: " + FinalUnit);
                                    System.out.println("Total: " + total);
                                    System.out.println("Diskon: " + (diskon * 100) + "%");
                                    System.out.println("Final: " + Final);
                                    System.out.println("==================");
                                }

                                System.out.println("Lakukan pembayaran sebesar");
                                bayar = input.nextDouble();
                                if (bayar < Final) {
                                    kurang = true;
                                } else {
                                    kurang = false;
                                }
                                if (kurang == true) {
                                    while (kurang == true) {
                                        System.out.println("==================");
                                        System.out.println("Not enough paid");
                                        System.out.println("==================");
                                        System.out.println("Final: " + Final);
                                        System.out.println("Pembayaran: " + bayar);
                                        System.out.println("Kurang: " + (Final - bayar));
                                        System.out.println("==================");
                                        System.out.println("klik 1 untuk menambahkan nominal, klik lainnya untuk membatalkan");
                                        actionPembeli2dot1 = input.nextInt();
                                        if (actionPembeli2dot1 == 1) {
                                                System.out.println("==================");
                                                System.out.println("Masukkan jumlah pembayaran tambahan");
                                                bayar += input.nextDouble();
                                                if (bayar >= total) {
                                                    kurang = false;
                                                }
                                        } else {
                                            pembeli2dot1 = false;
                                            kurang = false;
                                        }   
                                    }
                                }
                                    kembalian = bayar - Final;
                                    System.out.println("==================");
                                    System.out.println("Pembayaran berhasil");
                                    System.out.println("==================");
                                    System.out.println("Total: " + total);
                                    System.out.println("Final: " + Final);
                                    System.out.println("Pembayaran: " + bayar);
                                    System.out.println("Kembalian: " + kembalian);
                                    System.out.println("==================");
                                    System.exit(0);
                            }
                        } else {
                            pembeli2 = false;
                        }


                    }
                } else {
                    pembeli = false;
                }
            }
        } else{
            jalan = false;
        }
    };
};
};