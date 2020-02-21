public enum Country implements IlyaZlyck, Comparable<Country> {
    ZAMBIA (752_618, 17_351_708),
    ANGOLA (1_246_700, 25_789_024),
    ROMANIA (238_397, 19_401_658),
    ARMENIA (29_743, 2_951_745),
    ZIMBABWE (390_757, 14_438_802),
    AFGHANISTAN (652_230, 32_225_560);

    //first letters for you

    private long area;  //square kilometer
    private long population;

    Country(long area, long population){
        this.area = area;
        this.population = population;
    }

    public long getArea() {
        return this.area;
    }

    public long getPopulation() {
        return this.population;
    }

    }

