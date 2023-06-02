import static globals.Globals.*

BATCH_REACTOR = recipemap('batch_reactor')
CHEMICAL_BATH = recipemap('chemical_bath')
DISTILLERY = recipemap('distillery')
AUTOCLAVE = recipemap('autoclave')
ROASTER = recipemap('roaster')

//PRIMITIVE (LV)
AUTOCLAVE.recipeBuilder()
    .inputs(ore('dustBone'))
    .fluidInputs(fluid('water') * 250)
    .outputs(metaitem('dustTricalciumPhosphate') * 13)
    .outputs(metaitem('ingotFat'))
    .duration(120)
    .EUt(Globals.voltAmps[2])
    .buildAndRegister()

BATCH_REACTOR.recipeBuilder()
    .inputs(ore('dustTricalciumPhosphate') * 13)
    .fluidInputs(fluid('sulfuric_acid') * 2000)
    .outputs(metaitem('dustMonocalciumPhosphate') * 15)
    .fluidOutputs(fluid('water') * 2000)
    .duration(120)
    .EUt(Globals.voltAmps[2])
    .buildAndRegister()

ROASTER.recipeBuilder()
    .inputs(ore('dustMonocalciumPhosphate') * 15)
    .outputs(metaitem('dustCalciumPhosphite') * 11)
    .fluidOutputs(fluid('steam') * 2000)
    .duration(120)
    .EUt(Globals.voltAmps[2])
    .buildAndRegister()

ROASTER.recipeBuilder()
    .inputs(ore('dustCalciumPhosphite') * 33)
    .inputs(ore('dustCarbon') * 10)
    .outputs(metaitem('dustTricalciumPhosphate') * 13)
    .outputs(metaitem('dustWhitePhosphorus') * 4)
    .duration(360)
    .EUt(Globals.voltAmps[2])
    .buildAndRegister()

crafting.addShapeless('gregtech:dustPhosphorus', ore('dustWhitePhosphorus'), [ore('dustPhosphorus')])
crafting.addShapeless('gregtech:dustWhitePhosphorus', ore('dustPhosphorus'), [ore('dustWhitePhosphorus')])

//UNIVERSAL (MV)
//REMOVE APATITE RECIPES

CHEMICAL_BATH.recipeBuilder()
    .inputs(ore('dustHydroxyapatite') * 22)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .outputs(metaitem('dustCalciumSulfate') * 6)
    .fluidOutputs(fluid('diluted_phosphoric_acid') * 1000)
    .duration(200)
    .EUt(Globals.voltAmps[2])
    .buildAndRegister()

CHEMICAL_BATH.recipeBuilder()
    .inputs(ore('dustFluorapatite') * 21)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .outputs(metaitem('dustCalciumSulfate') * 6)
    .fluidOutputs(fluid('phosphoric_acid') * 3000)
    .fluidOutputs(fluid('hydrogen_fluoride') * 1000)
    .duration(200)
    .EUt(Globals.voltAmps[2])
    .buildAndRegister()

CHEMICAL_BATH.recipeBuilder()
    .inputs(ore('dustChlorapatite') * 21)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .outputs(metaitem('dustCalciumSulfate') * 6)
    .fluidOutputs(fluid('phosphoric_acid') * 3000)
    .fluidOutputs(fluid('hydrogen_chloride') * 1000)
    .duration(200)
    .EUt(Globals.voltAmps[2])
    .buildAndRegister()

DISTILLERY.recipeBuilder()
    .fluidInputs(fluid('diluted_phosphoric_acid') * 1000)
    .fluidOutputs(fluid('phosphoric_acid') * 3000)
    .duration(200)
    .EUt(Globals.voltAmps[1])
    .buildAndRegister()

//SPECIALIZED (HV) (FOR PHOSPHORITE, DEPENDENCY ON FROTH FLOTATION, WILL NOT IMPLEMENT YET)



