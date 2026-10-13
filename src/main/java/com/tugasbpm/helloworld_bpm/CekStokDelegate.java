package com.tugasbpm.helloworld_bpm;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("cekStokDelegate")
public class CekStokDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("==================================================");
        System.out.println("LOGIKA PERPUSTAKAAN: Stok buku tersedia!");
        System.out.println("ID Proses Peminjaman: " + execution.getProcessInstanceId());
        System.out.println("==================================================");
    }
}