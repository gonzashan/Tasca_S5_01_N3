package cat.itacademy.barcelonactiva.sanmiguelalonso.gonzalo.s05.t01.n01.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FlorDTO implements Serializable {

    private Integer pk_FlorID;
    private String nomFlor;
    private String paisFlor;
    private String tipusFlor;


    private final String IN = "UE", OUT = "Fora UE";

    private List<String> countries =
            new ArrayList<>(List.of(
                    "Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech Republic",
                    "Denmark", "Estonia", "Finland", "France", "Germany", "Greece",
                    "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg",
                    "Malta", "Netherlands", "Poland", "Portugal", "Romania", "San Marino",
                    "Slovakia", "Slovenia", "Spain", "Sweden", "Vatican City"));

    public FlorDTO() {
    }

    /* Getters & Setters */

    public Integer getPk_FlorID() {
        return pk_FlorID;
    }

    public void setPk_FlorID(Integer pk_FlorID) {
        this.pk_FlorID = pk_FlorID;
    }

    public String getNomFlor() {
        return nomFlor;
    }

    public void setNomFlor(String nomFlor) {
        this.nomFlor = nomFlor;
    }

    public String getPaisFlor() {
        return paisFlor;
    }

    public void setPaisFlor(String paisFlor) {
        this.paisFlor = paisFlor;
    }

    public String getTipusFlor() {
        return tipusFlor;
    }

    public void setTipusFlor(String tipusFlor) {
        this.tipusFlor = tipusFlor;
    }




}
