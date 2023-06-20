package material;

import static material.SuSyMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.properties.*

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;

import static supersymmetry.api.unification.material.info.SuSyMaterialFlags.*;

public class UnknownCompositionMaterials {
 
    public static void register() {

        log.infoMC("Registering Unknown Composition Materials!");

        EarthGreenhouseGas = new Material.Builder(4000, "greenhouse_gases")
            .fluid(FluidTypes.GAS)
            .color(0x95cade)
            .build();

        Asphalt = new Material.Builder(4001, "asphalt")
                .dust()
                .color(0x000000)
                .build();

        BlackAsh = new Material.Builder(4002, 'black_ash')
                .dust()
                .color(0x000000)
                .colorAverage()
                .build();

        MolecularSieve = new Material.Builder(4003, 'molecular_sieve')
                .dust()
                .iconSet(SHINY)
                .color(0x737373)
                .colorAverage()
                .build();

        WetMolecularSieve = new Material.Builder(4004, 'wet_molecular_sieve')
                .dust()
                .iconSet(SHINY)
                .color(0x5c5c5c)
                .colorAverage()
                .build();

        RawMolecularSieve = new Material.Builder(4005, "raw_molecular_sieve")
                .fluid()
                .color(0x8c94a8)
                .build();

        FlueGas = new Material.Builder(4006, 'flue_gas')
                .fluid(FluidTypes.GAS)
                .color(0x484a48)
                .fluidTemp(1000)
                .build();

        ExhaustSteam = new Material.Builder(4007, 'exhaust_steam')
                .fluid(FluidTypes.GAS)
                .color(0xc4c4c4)
                .fluidTemp(1000)
                .build();

        SmokeBombMix = new Material.Builder(4008, 'smoke_bomb_mix')
                .fluid(FluidTypes.GAS)
                .color(0x515443)
                .build();

        SugaryWater = new Material.Builder(4009, "sugary_water")
                .fluid()
                .color(0x8fbf9b)
                .build();

        ClarifiedSugaryWater = new Material.Builder(4010, "clarified_sugary_water")
                .fluid()
                .color(0xa7d6b3)
                .build();

        Brine = new Material.Builder(4011, "brine")
                .fluid()
                .color(0xd1d08e)
                .build();

        ImpureSodiumAluminateSolution = new Material.Builder(4012, "impure_sodium_aluminate_solution")
                .fluid()
                .color(0x5b80ba)
                .build();

        RedMud = new Material.Builder(4013, "red_mud")
                .fluid()
                .color(0x913f2d)
                .build();

        ImpureSodaAshSolution = new Material.Builder(4014, "impure_soda_ash_solution")
                .fluid()
                .color(0x91919b)
                .build();

        ImpureSodiumHydroxideSolution = new Material.Builder(4015, "impure_sodium_hydroxide_solution")
                .fluid()
                .color(0x3a4991)
                .build();

        ConcentratedRedMud = new Material.Builder(4016, "concentrated_red_mud")
                .fluid()
                .color(0x824133)
                .build();

        AmmoniaReactionMix = new Material.Builder(4017, "ammonia_reaction_mix")
                .fluid(FluidTypes.GAS)
                .color(0x38478a)
                .fluidTemp(400)
                .build();

        AmmoniaRichGas = new Material.Builder(4018, "ammonia_rich_gas")
                .fluid(FluidTypes.GAS)
                .color(0x345691)
                .fluidTemp(400)
                .build();

        GraphiteMix = new Material.Builder(4019, "graphite_mix")
                .fluid()
                .color(0x080808)
                .build();

        Mash = new Material.Builder(4020, "mash")
                .fluid()
                .color(0x9e8660)
                .build();

        WeedKiller = new Material.Builder(4021, "weed_killer")
                .fluid()
                .color(0xade677)
                .build();

        Pesticide = new Material.Builder(4022, "pesticide")
                .fluid()
                .color(0xc0c77d)
                .build();

        GrainSolution = new Material.Builder(4023, "grain_solution")
                .fluid()
                .color(0xc2cc9d)
                .build();

        YeastSolution = new Material.Builder(4024, "yeast_solution")
                .fluid()
                .color(0xe6e3aa)
                .build();

        ImpureEthanol = new Material.Builder(4025, "impure_ethanol")
                .fluid()
                .color(0xbf9c77)
                .build();

        BorateLiquor = new Material.Builder(4026, "borate_liquor")
                .fluid()
                .color(0xacbbac)
                .build();

        ImpureAcetaldehyde = new Material.Builder(4027, "impure_acetaldehyde")
                .fluid()
                .color(0x6e6e6e)
                .build();

        CativaProcessPreparation = new Material.Builder(4028, "cativa_process_preparation")
                .fluid()
                .color(0x9c8275)
                .build();

        CativaProcessSolution = new Material.Builder(4029, "cativa_process_solution")
                .fluid()
                .color(0x75665e)
                .build();

        AcidicCumene = new Material.Builder(4030, "acidic_cumene")
                .fluid()
                .color(0x571a0b)
                .build()

        RearrangedCumene = new Material.Builder(4031, "rearranged_cumene")
                .fluid()
                .color(0x4f2f27)
                .build();

        AlkylatedButane = new Material.Builder(4032, "alkylated_butane")
                .fluid()
                .color(0x6e4c2c)
                .build();

        ImpureKaptonK = new Material.Builder(4033, "impure_kapton_k")
                .fluid()
                .color(0xe0b53f)
                .build();

        ImpureKaptonE = new Material.Builder(4034, "impure_kapton_e")
                .fluid()
                .color(0xcad96f)
                .build();

        KaptonEPreparation = new Material.Builder(4035, "kapton_e_preparation")
                .fluid()
                .color(0x899444)
                .build();

        ImpureDiiodobenzene = new Material.Builder(4036, "impure_diiodobenzene")
                .fluid()
                .color(0x736c63)
                .build();

        ImpureEthyleneOxide = new Material.Builder(4037, "impure_ethylene_oxide")
                .fluid(FluidTypes.GAS)
                .color(0x52755c)
                .build();

        AmocoProcessCatalyst = new Material.Builder(4038, "amoco_process_catalyst")
                .dust()
                .iconSet(SHINY)
                .color(0xdea68c)
                .build();

        GraniteTailings = new Material.Builder(4039, "granite_tailings")
                .dust()
                .color(0x302323)
                .build();

        LimestoneTailings = new Material.Builder(4040, "limestone_tailings")
                .dust()
                .color(0x68695d)
                .build();

        PegmatiteTailings = new Material.Builder(4041, "pegmatite_tailings")
                .dust()
                .color(0x1f1c1c)
                .build();

        UltramaficTailings = new Material.Builder(4042, "ultramafic_tailings")
                .dust()
                .color(0x141414)
                .build();

        Corundum = new Material.Builder(4043, "corundum")
                .dust()
                .iconSet(SHINY)
                .color(0x7a4261)
                .build();

        Tourmaline = new Material.Builder(4044, "tourmaline")
                .dust().gem()
                .iconSet(SHINY)
                .color(0x8c613f)
                .build();

        NonMarineEvaporite = new Material.Builder(4045, "non_marine_evaporite")
                .dust()
                .color(0x78756d)
                .build();

        HalideEvaporite = new Material.Builder(4046, "halide_evaporite")
                .dust()
                .color(0x99867c)
                .build();

        CarbonateEvaporite = new Material.Builder(4047, "carbonate_evaporite")
                .dust()
                .color(0xe3e3e3)
                .build();

        SulfateEvaporite = new Material.Builder(4048, "sulfate_evaporite")
                .dust()
                .color(0xc7c0b1)
                .build();

        Vinegar = new Material.Builder(4049, "vinegar")
                .fluid()
                .color(0xc3c4b3)
                .build();

        RawCellulose = new Material.Builder(4050, "raw_cellulose")
                .dust()
                .color(0x302b1a)
                .build();

        WhiteLiquor = new Material.Builder(4051, "white_liquor")
                .fluid()
                .color(0xd9d3c1)
                .build();

        BlackLiquor = new Material.Builder(4052, "black_liquor")
                .fluid()
                .color(0x2e2a1f)
                .build();

        ConcentratedBlackLiquor = new Material.Builder(4053, "concentrated_black_liquor")
                .fluid()
                .color(0x1f1d18)
                .build();

        GreenLiquor = new Material.Builder(4054, "green_liquor")
                .fluid()
                .color(0x2b4536)
                .build();

        AcidicCelluloseSolution = new Material.Builder(4055, "acidic_cellulose_solution")
                .fluid()
                .color(0xb7bd60)
                .build();

        Wastewater = new Material.Builder(4056, "wastewater")
                .fluid()
                .color(0x2d402f)
                .build();

        HeatedWastewater = new Material.Builder(4057, "heated_wastewater")
                .fluid()
                .fluidTemp(340)
                .color(0x435e46)
                .build();

        FlocculatedWastewater = new Material.Builder(4058, "flocculated_wastewater")
                .fluid()
                .color(0x435e46)
                .build();

        FilteredWastewater = new Material.Builder(4059, "filtered_wastewater")
                .fluid()
                .color(0x457568)
                .build();

        WastewaterSludge = new Material.Builder(4060, "wastewater_sludge")
                .fluid()
                .color(0x2b1e1e)
                .build();

        CarburizedStainlessSteel = new Material.Builder(4061, 'carburized_stainless_steel')
                .dust().fluid()
                .fluidTemp(1500)
                .color(0x6b6552)
                .build()

        UnscrubbedWoodGas = new Material.Builder(4062, "unscrubbed_wood_gas")
                .fluid(FluidTypes.GAS)
                .color(0x85806f)
                .build();

        LightOil = new Material.Builder(4063, "light_oil")
                .fluid()
                .color(0x5e5e4d)
                .build();

        NaphthaleneOil = new Material.Builder(4065, "naphthalene_oil")
                .fluid()
                .color(0x2e2926)
                .build();

        AnthraceneOil = new Material.Builder(4066, "anthracene_oil")
                .fluid()
                .color(0x211f1e)
                .build();

        AlkalineNaphthaleneOil = new Material.Builder(4067, "alkaline_naphthalene_oil")
                .fluid()
                .color(0x403833)
                .build();

        PurifiedNaphthaleneOil = new Material.Builder(4068, "purified_naphthalene_oil")
                .fluid()
                .color(0x595542)
                .build();

        AcidicLightOil = new Material.Builder(4069, "acidic_light_oil")
                .fluid()
                .color(0x87816c)
                .build();

        CrudePyridiniumSulfate = new Material.Builder(4070, "crude_pyridinium_sulfate")
                .fluid()
                .color(0x48523b)
                .build();

        ImpurePyridine = new Material.Builder(4071, "impure_pyridine")
                .fluid()
                .color(0x233326)
                .build();

        AcidicAnthraceneOil = new Material.Builder(4072, "acidic_anthracene_oil")
                .fluid()
                .color(0x87816c)
                .build();

        AnthraceneExtract = new Material.Builder(4073, "anthracene_extract")
                .fluid()
                .color(0x211c1c)
                .build();

        CrudeQuinoliniumSulfate = new Material.Builder(4074, "crude_quinolinium_sulfate")
                .fluid()
                .color(0x1b1c0a)
                .build();

        ImpureQuinoline = new Material.Builder(4075, "impure_quinoline")
                .fluid()
                .color(0x222418)
                .build();

        ConcentratedBrine = new Material.Builder(4076, "concentrated_brine")
                .fluid()
                .color(0xa6a444)
                .build();

        BoronFreeBrine = new Material.Builder(4078, "boron_free_brine")
                .fluid()
                .color(0xa68a44)
                .build();

        LithiumFreeBrine = new Material.Builder(4079, "lithium_free_brine")
                .fluid()
                .color(0xa17a4c)
                .build();

        ChlorinatedBrine = new Material.Builder(4080, "chlorinated_brine")
                .fluid()
                .color(0xa3b560)
                .build();

        ImpureBromine = new Material.Builder(4081, "impure_bromine")
                .fluid(FluidTypes.GAS)
                .color(0x572d2b)
                .build();

        ChilledLava = new Material.Builder(4082, "chilled_lava")
                .color(0x4d2d25)
                .fluidTemp(400)
                .build();

        ChilledFlueGas = new Material.Builder(4083, "chilled_flue_gas")
                .fluid(FluidTypes.GAS)
                .color(0x171717)
                .fluidTemp(400)
                .build();

        WoodAsh = new Material.Builder(4084, "wood_ash")
                .dust()
                .color(0x242221)
                .build();

        VeryConcentratedBrine = new Material.Builder(4085, "very_concentrated_brine")
                .fluid()
                .color(0xb5b226)
                .build();

        LangbeiniteLeach = new Material.Builder(4086, "langbeinite_leach")
                .fluid()
                .color(0x9c9a87)
                .build();

        PolyhaliteLeach = new Material.Builder(4087, "polyhalite_leach")
                .fluid()
                .color(0xb3a094)
                .build();

        TinDross = new Material.Builder(4088, "tin_dross")
                .dust().fluid()
                .fluidTemp(600)
                .color(0x2a2e2e)
                .build();

        DecopperizedTin = new Material.Builder(4089, "decopperized_tin")
                .dust().fluid()
                .fluidTemp(600)
                .color(0xb5b7c9)
                .build();

        KainiteLeach = new Material.Builder(4090, "kainite_leach")
                .fluid()
                .color(0xadb07f)
                .build();

        Zeolite13X = new Material.Builder(4091, "zeolite_13")
                .dust()
                .iconSet(SHINY)
                .color(0xe4e8bc)
                .build();

        Zeolite13XSolution = new Material.Builder(4092, "zeolite_13_solution")
                .fluid()
                .color(0xe4e8bc)
                .build();

        LTSCatalyst = new Material.Builder(4093, "lts_catalyst")
                .dust()
                .flags(GENERATE_CATALYST_BED)
                .color(0x756857)
                .build();

        HTSCatalyst = new Material.Builder(4094, "hts_catalyst")
                .dust()
                .color(0x5e4f4f)
                .build();

        SpentBismuthCatalyst = new Material.Builder(4095, "spent_bismuth_catalyst")
                .dust()
                .color(0x31403f)
                .build();

        AlkalineSodiumOleateSolution = new Material.Builder(4096, "alkaline_sodium_oleate_solution")
                .fluid()
                .color(0xa6b584)
                .build();

        FattyAcidSolution = new Material.Builder(4097, "fatty_acid_solution")
                .fluid()
                .color(0xa1ad5c)
                .build();

        OleicAcidSolution = new Material.Builder(4098, "oleic_acid_solution")
                .fluid()
                .color(0x8dbf67)
                .build();

        AluminiumSilicateLeach = new Material.Builder(4099, "aluminium_silicate_leach")
                .fluid()
                .color(0x587682)
                .build();

        AlkaliAlumMix = new Material.Builder(4100, "alkali_alum_mix")
                .iconSet(SHINY)
                .dust()
                .color(0xe34949)
                .build();

        AmblygoniteLeach = new Material.Builder(4101, "amblygonite_leach")
                .fluid()
                .color(0xbaced6)
                .build();

        RoastedLepidolite = new Material.Builder(4102, "roasted_lepidolite")
                .dust()
                .color(0x443b45)
                .iconSet(SAND)
                .build();

        LepidoliteLeach = new Material.Builder(4103, "lepidolite_leach")
                .fluid()
                .color(0x805066)
                .build();

        NeutralizedLepidoliteLeach = new Material.Builder(4104, "neutralized_lepidolite_leach")
                .fluid()
                .color(0x675d85)
                .build();

        AluminiumFreeLepidoliteLeach = new Material.Builder(4105, "aluminium_free_lepidolite_leach")
                .fluid()
                .color(0x557365)
                .build();

        GoldLeachSolution = new Material.Builder(4106, "gold_leach_solution")
                .fluid()
                .color(0x9c8a46)
                .build();

        ImpureAmmoniumFluoroberyllateSolution = new Material.Builder(4107, "ammonium_fluoroberyllate_solution")
                .fluid()
                .color(0x1b8541)
                .build();

        ImpureAmmoniumFluoroberyllateSolution.setFormula("(?)(NH4)2(BeF4)(H2O)3", true)

        ImpureBerylliumSulfateSolution = new Material.Builder(4108, "impure_beryllium_sulfate_solution")
                .fluid()
                .color(0x608726)
                .build();

        ImpureLithiumSulfateSolution = new Material.Builder(4109, "impure_lithium_sulfate_solution")
                .fluid()
                .color(0xf0bc89)
                .build();

        GalenaByproductsSlurry = new Material.Builder(4110, "galena_byproducts_slurry")
                .fluid()
                .color(0x592880)
                .build();

        SinteredLeadConcentrate = new Material.Builder(4111, "sintered_lead_concentrate")
                .dust()
                .color(0x3a1954)
                .iconSet(SAND)
                .build();

        CadmiumRichFlueDust = new Material.Builder(4112, "cadmium_rich_flue_dust")
                .dust()
                .color(0x757061)
                .iconSet(DULL)
                .build();

        BlackMetal = new Material.Builder(4113, "black_metal")
                .dust()
                .color(0x3d3440)
                .build();

        AntimonyArsenicFlueDust = new Material.Builder(4114, "antimony_arsenic_flue_dust")
                .dust()
                .color(0x707063)
                .iconSet(DULL)
                .build();

        BurnedBlackMetal = new Material.Builder(4115, "burned_black_metal")
                .dust()
                .color(0x3d3440)
                .iconSet(DULL)
                .build();

        LithargeSlag = new Material.Builder(4116, "litharge_slag")
                .dust()
                .color(0xb5443c)
                .iconSet(DULL)
                .build();

        HarrisSlag = new Material.Builder(4117, "harris_slag")
                .dust()
                .color(0xabb074)
                .iconSet(DULL)
                .build();

        SodiumArsenateStannateSolution = new Material.Builder(4118, "sodium_arsenate_stannate_solution")
                .fluid()
                .color(0x5c3a23)
                .build();
        
        SodiumArsenateStannateMixture = new Material.Builder(4119, "sodium_arsenate_stannate_mixture")
                .dust()
                .color(0x784c2f)
                .build();

        ImpureEthyleneGlycol = new Material.Builder(4120, "impure_ethylene_glycol")
                .fluid()
                .color(0xc8c8e0)
                .build();

        ImpureSaturatedAmmoniacalMethanol = new Material.Builder(4121, "impure_saturated_ammoniacal_methanol")
                .fluid()
                .color(0xad8653)
                .build();

        CarnalliteLeach = new Material.Builder(4122, "carnallite_leach")
                .fluid()
                .color(0xc1c499)
                .build();

        HaliteLeach = new Material.Builder(4123, "halite_leach")
                .fluid()
                .color(0x9bbdbc)
                .build();

        EthylenediaminePyrocatechol = new Material.Builder(4124, "ethylenediamine_pyrocatechol")
                .fluid()
                .color(0x42392f)
                .build();

        CeramicThickFilmPaste = new Material.Builder(4125, "ceramic_thick_film_paste")
                .fluid()
                .color(0x000000)
                .build();

        BoraxElectrolyte = new Material.Builder(4126, "borax_electrolyte")
                .fluid()
                .color(0x85806b)
                .build();

        FerroelectricCeramicBinding = new Material.Builder(4127, "ferroelectric_ceramic_binding")
                .fluid()
                .color(0xede772)
                .build();

        DisproportionatedTrichlorosilane = new Material.Builder(4128, 'disproportionated_trichlorosilane')
                .fluid()
                .color(0x849169)
                .build()

        DisproportionatedDichlorosilane = new Material.Builder(4129, 'disproportionated_dichlorosilane')
                .fluid()
                .color(0xa1ad86)
                .build()

        DisproportionatedChlorosilane = new Material.Builder(4130, 'disproportionated_chlorosilane')
                .fluid()
                .color(0xb5bf9b)
                .build()
      
        MetalNitrateSolution = new Material.Builder(4131, "metal_nitrate_solution")
                .fluid()
                .color(0x663422)
                .build();

        NeutralizedMetalNitrateSolution = new Material.Builder(4132, "neutralized_metal_nitrate_solution")
                .fluid()
                .color(0x734d3f)
                .build();

        MetalNitrateCatalyst = new Material.Builder(4133, "metal_nitrate_catalyst")
                .dust()
                .iconSet(SHINY)
                .color(0xb58877)
                .build();

        TwoEthylhexylPhosphoricAcidMix = new Material.Builder(4134, "two_ethylhexyl_phosphoric_acid_mix")
                .fluid()
                .color(0xd1bb75)
                .build();

        RareEarthCatalystYNd = new Material.Builder(4135, "rare_earth_catalyst_y_nd")
                .dust()
                .color(0x2e2a2a)
                .build();

        DilutedPrimaryAmineN = new Material.Builder(4136, "diluted_primary_amine_n")
                .fluid()
                .color(0x704a9e)
                .build();

        CrosslinkedPolystyrene = new Material.Builder(4137, "crosslinked_polystyrene")
                .ingot().fluid()
                .flags(GENERATE_ROUND)
                .color(0xa7a9d6)
                .build();

        EthyleneGlycolMix = new Material.Builder(4138, "ethylene_glycol_mix")
                .fluid()
                .color(0x2eafc9)
                .build();

        PalladiumDopedCrosslinkedPolystyrene = new Material.Builder(4139, "palladium_doped_crosslinked_polystyrene")
                .ingot().fluid()
                .flags(GENERATE_ROUND)
                .color(0xe0e6bc)
                .build();

        TrialkylaluminiumMixture = new Material.Builder(4140, 'trialkylaluminium_mixture')
                .fluid()
                .color(0x6b777d)
                .build()

        TrialkylaluminiumMixture.setFormula("AlR3", true)

        AluminiumAlkoxideMixture = new Material.Builder(4141, 'aluminium_alkoxide_mixture')
                .dust()
                .color(0x657780)
                .build()

        AluminiumAlkoxideMixture.setFormula("Al(OR)3", true)

        ZieglerAlcoholMixture = new Material.Builder(4142, 'ziegler_alcohol_mixture')
                .fluid()
                .color(0xc47631)
                .build()

        ImpureDiethylEther = new Material.Builder(4143, "impure_diethyl_ether")
                .fluid()
                .color(0x5e9cff)
                .build()

        AluminiumAlkoxideSolution = new Material.Builder(4144, 'aluminium_alkoxide_solution')
                .fluid()
                .color(0x657780)
                .build()

        AluminiumAlkoxideSolution.setFormula("[(C2H5)2O]Al(OR)3", true)

        CapsaicinSolution = new Material.Builder(4118, 'capsaicin_solution')
                .fluid()
                .color(0xd43b2a)
                .build()

        TearGas = new Material.Builder(4119, 'tear_gas')
                .fluid()
                .color(0xd1ba5c)
                .build()

        HydratedPropene = new Material.Builder(4120, 'hydrated_propene')
                .fluid()
                .color(0xc9997d)
                .build()

        EthylamineMix = new Material.Builder(4121, 'ethylamine_mix')
                .fluid()
                .color(0xdbaf48)
                .build()
    }
}