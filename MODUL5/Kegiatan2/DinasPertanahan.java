class DinasPertanahan{
    private String alamat;
    private int panjangTanah;
    private int luasTanah;

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPanjangTanah(int panjangTanah){
        this.panjangTanah = panjangTanah;
    }

    public void setLuasTanah(int luasTanah){
        this.luasTanah = luasTanah;
    }

    public String getAlamat(){
        return alamat;
    }

    public int getPanjangTanah(){
        return panjangTanah;
    }

    public int getLuasTanah(){
        return luasTanah;
    }

    public String display(){
        return "Alamat = "+getAlamat()+"\nPanjang Tanah = "+getPanjangTanah()+"\nLuas Tanah = "+getLuasTanah();
    }
}