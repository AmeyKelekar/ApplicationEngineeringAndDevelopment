/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Government.CensusDataDirectory;

/**
 *
 * @author Amey
 */
public class CensusDataWorkRequest extends WorkRequest {
    private String dataResult;
    private CensusDataDirectory censusDataDirectory;

    public String getDataResult() {
        return dataResult;
    }

    public void setDataResult(String dataResult) {
        this.dataResult = dataResult;
    }

    public CensusDataDirectory getCensusDataDirectory() {
        return censusDataDirectory;
    }

    public void setCensusDataDirectory(CensusDataDirectory censusDataDirectory) {
        this.censusDataDirectory = censusDataDirectory;
    }
}
