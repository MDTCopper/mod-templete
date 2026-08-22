package example.examplemod.patch.impl;

import arc.util.*;
import mindustry.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(Vars.class)
public abstract class MyPatch {
    @Inject(method = "finishLaunch", at = @At("RETURN"))
    private static void addInjectedLog(CallbackInfo ci) {
        Log.info("Injected to Vars::finishLaunch by example mod.");
    }
}
