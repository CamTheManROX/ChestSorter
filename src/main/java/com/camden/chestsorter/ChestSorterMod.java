package com.camden.chestsorter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class ChestSorterMod implements ModInitializer {
    public static final String MOD_ID = "chestsorter";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Chest Sorter initialized");
    }
}