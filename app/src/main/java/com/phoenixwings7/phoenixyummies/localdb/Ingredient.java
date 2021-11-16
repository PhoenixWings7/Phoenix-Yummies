package com.phoenixwings7.phoenixyummies.localdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ingredients")
public class Ingredient {
    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "spooncular_id")
    private long spooncularId;

    private String name;
    private String unit;

    @ColumnInfo(name = "unit_short")
    private String unitShort;

    public long getIngredientId() {
        return id;
    }
    public long getSpooncularId() {return spooncularId;}

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getUnitShort() {
        return unitShort;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSpooncularId(long spooncularId) {
        this.spooncularId = spooncularId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnitShort(String unitShort) {
        this.unitShort = unitShort;
    }
}
