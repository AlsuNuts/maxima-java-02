package org.example;
//Описать Интерфейс Repairable с методами void startRepair(), void finishRepair(), boolean isRepairing().
//Все виды транспорта должны реализовывать этот интерфейс.

public interface Repairable {
    void startRepair();
    void finishRepair();
    boolean isRepairing();

}
