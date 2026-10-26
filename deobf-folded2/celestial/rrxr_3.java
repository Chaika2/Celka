package celestial;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrxr_3 {
   static final Logger Gq = LogManager.getLogger();
   private static boolean GT = id_class("*** Reflector Forge ***");
   public static rrxB_2 id_class = new rrxB_2("mods.betterfoliage.client.BetterFoliageClient");
   public static rrxB_2 id_break = new rrxB_2("net.minecraftforge.fml.BrandingControl");
   public static rrxG_2 id_byte = new rrxG_2(id_break, "getBrandings");
   public static rrxG_2 id_protected = new rrxG_2(id_break, "forEachLine");
   public static rrxG_2 id_throws = new rrxG_2(id_break, "forEachAboveCopyrightLine");
   public static rrxB_2 id_case = new rrxB_2("net.minecraftforge.common.capabilities.ICapabilityProvider");
   public static rrxB_2 id_catch = new rrxB_2("net.minecraftforge.common.capabilities.CapabilityProvider");
   public static rrxG_2 id_private = new rrxG_2(id_catch, "gatherCapabilities", new Class[0]);
   public static rrxB_2 id_implements = new rrxB_2("net.minecraftforge.fml.client.ClientModLoader");
   public static rrxG_2 id_finally = new rrxG_2(id_implements, "isLoading");
   public static rrxG_2 id_extends = new rrxG_2(id_implements, "renderProgressText");
   public static rrxB_2 id_native = new rrxB_2("net.minecraftforge.event.world.ChunkDataEvent$Save");
   public static rrxS_2 id_volatile = new rrxS_2(id_native, new Class[]{roC_2.class, rRg_1.class, rcd_3.class});
   public static rrxB_2 id_final = new rrxB_2("net.minecraftforge.event.world.ChunkEvent$Load");
   public static rrxS_2 id_package = new rrxS_2(id_final, new Class[]{roC_2.class});
   public static rrxB_2 id_int = new rrxB_2("net.minecraftforge.event.world.ChunkEvent$Unload");
   public static rrxS_2 id_new = new rrxS_2(id_int, new Class[]{roC_2.class});
   public static rrxB_2 id_continue = new rrxB_2("net.minecraftforge.fml.client.ClientHooks");
   public static rrxG_2 id_super = new rrxG_2(id_continue, "trackBrokenTexture");
   public static rrxG_2 id_this = new rrxG_2(id_continue, "trackMissingTexture");
   public static rrxB_2 id_else = new rrxB_2("net.minecraftforge.fml.CrashReportExtender");
   public static rrxG_2 id_synchronized = new rrxG_2(id_else, "enhanceCrashReport");
   public static rrxG_2 id_return = new rrxG_2(id_else, "addCrashReportHeader");
   public static rrxG_2 id_public = new rrxG_2(id_else, "generateEnhancedStackTrace", new Class[]{Throwable.class});
   public static rrxG_2 id_goto = new rrxG_2(id_else, "generateEnhancedStackTrace", new Class[]{StackTraceElement[].class});
   public static rrxB_2 id_while = new rrxB_2("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre");
   public static rrxS_2 id_try = new rrxS_2(id_while, new Class[]{vm_3.class, Ml_1.class, int.class, int.class, float.class});
   public static rrxB_2 id_instanceof = new rrxB_2("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post");
   public static rrxS_2 id_throw = new rrxS_2(id_instanceof, new Class[]{vm_3.class, Ml_1.class, int.class, int.class, float.class});
   public static rrxB_2 id_interface = new rrxB_2("net.minecraftforge.fml.loading.progress.EarlyProgressVisualization");
   public static rrxs_3 id_char = new rrxs_3(id_interface, "INSTANCE");
   public static rrxG_2 id_abstract = new rrxG_2(id_interface, "handOffWindow");
   public static rrxB_2 id_long = new rrxB_2("net.minecraftforge.event.entity.EntityLeaveWorldEvent");
   public static rrxS_2 id_float = new rrxS_2(id_long, new Class[]{an_3.class, rYB.class});
   public static rrxB_2 id_void = new rrxB_2("net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup");
   public static rrxG_2 id_static = new rrxG_2(id_void, "getYaw");
   public static rrxG_2 id_import = new rrxG_2(id_void, "getPitch");
   public static rrxG_2 id_short = new rrxG_2(id_void, "getRoll");
   public static rrxB_2 id_default = new rrxB_2("net.minecraftforge.client.event.EntityViewRenderEvent$FogColors");
   public static rrxS_2 id_const = new rrxS_2(id_default, new Class[]{ly_3.class, float.class, float.class, float.class, float.class});
   public static rrxG_2 id_strictfp = new rrxG_2(id_default, "getRed");
   public static rrxG_2 id_boolean = new rrxG_2(id_default, "getGreen");
   public static rrxG_2 id_transient = new rrxG_2(id_default, "getBlue");
   public static rrxB_2 id_for = new rrxB_2("net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent");
   public static rrxS_2 id_double = new rrxS_2(id_for, new Class[]{HG.class, ly_3.class, float.class, float.class});
   public static rrxB_2 id_switch = new rrxB_2("net.minecraftforge.event.entity.EntityJoinWorldEvent");
   public static rrxS_2 r = new rrxS_2(id_switch, new Class[]{an_3.class, rYB.class});
   public static rrxB_2 P = new rrxB_2("net.minecraftforge.eventbus.api.Event");
   public static rrxG_2 B = new rrxG_2(P, "isCanceled");
   public static rrxG_2 S = new rrxG_2(P, "getResult");
   public static rrxB_2 s = new rrxB_2("net.minecraftforge.eventbus.api.IEventBus");
   public static rrxG_2 E = new rrxG_2(s, "post", new Class[]{rrGg_1.class});
   public static rrxB_2 G = new rrxB_2("net.minecraftforge.eventbus.api.Event$Result");
   public static rrxs_3 b = new rrxs_3(G, "DENY");
   public static rrxs_3 M = new rrxs_3(G, "ALLOW");
   public static rrxs_3 O = new rrxs_3(G, "DEFAULT");
   public static rrxB_2 h = new rrxB_2("net.minecraftforge.common.extensions.IForgeBlock");
   public static rrxG_2 X = new rrxG_2(h, "getTags");
   public static rrxB_2 J = new rrxB_2("net.minecraftforge.client.model.pipeline.ForgeBlockModelRenderer");
   public static rrxS_2 x = new rrxS_2(J, new Class[]{yC_2.class});
   public static rrxB_2 d = new rrxB_2(lY_2.class);
   public static rrxG_2 k = new rrxG_2(d, "getTexture", new Class[]{xc_3.class, rYB.class, rfH_2.class});
   public static rrxB_2 W = new rrxB_2("net.minecraftforge.common.extensions.IForgeBlockState");
   public static rrxG_2 z = new rrxG_2(W, "addDestroyEffects");
   public static rrxG_2 Q = new rrxG_2(W, "addHitEffects");
   public static rrxG_2 N = new rrxG_2(W, "getLightValue", new Class[]{rRq_1.class, rfH_2.class});
   public static rrxG_2 c = new rrxG_2(W, "getSoundType", new Class[]{rRR.class, rfH_2.class, an_3.class});
   public static rrxG_2 u = new rrxG_2(W, "getStateAtViewpoint");
   public static rrxG_2 m = new rrxG_2(W, "hasTileEntity");
   public static rrxG_2 Z = new rrxG_2(W, "isAir", new Class[]{rRq_1.class, rfH_2.class});
   public static rrxG_2 v = new rrxG_2(W, "shouldDisplayFluidOverlay");
   public static rrxB_2 F = new rrxB_2("net.minecraftforge.common.extensions.IForgeFluid");
   public static rrxG_2 L = new rrxG_2(F, "getAttributes");
   public static rrxB_2 A = new rrxB_2("net.minecraftforge.common.extensions.IForgeEntity");
   public static rrxG_2 n = new rrxG_2(A, "canUpdate", new Class[0]);
   public static rrxG_2 C = new rrxG_2(A, "getParts");
   public static rrxG_2 l = new rrxG_2(A, "isMultipartEntity");
   public static rrxG_2 H = new rrxG_2(A, "onAddedToWorld");
   public static rrxG_2 y = new rrxG_2(A, "onRemovedFromWorld");
   public static rrxG_2 p = new rrxG_2(A, "shouldRiderSit");
   public static rrxB_2 q = new rrxB_2("net.minecraftforge.fluids.FluidAttributes");
   public static rrxG_2 T = new rrxG_2(q, "getColor", new Class[]{rRp_1.class, rfH_2.class});
   public static rrxB_2 t = new rrxB_2(aI_2.class);
   public static rrxG_2 w = new rrxG_2(t, "getTags");
   public static rrxB_2 I = new rrxB_2("net.minecraftforge.event.ForgeEventFactory");
   public static rrxG_2 f = new rrxG_2(I, "canEntityDespawn");
   public static rrxG_2 j = new rrxG_2(I, "fireChunkWatch", new Class[]{boolean.class, boolean.class, rhN_2.class, rfj_3.class, rrEm_1.class});
   public static rrxG_2 V = new rrxG_2(I, "getMaxSpawnPackSize");
   public static rrxG_2 g = new rrxG_2(I, "getMobGriefingEvent");
   public static rrxG_2 R = new rrxG_2(I, "onPlaySoundAtEntity");
   public static rrxG_2 Y = new rrxG_2(I, "renderBlockOverlay");
   public static rrxG_2 o = new rrxG_2(I, "renderFireOverlay");
   public static rrxG_2 K = new rrxG_2(I, "renderWaterOverlay");
   public static rrxB_2 D = new rrxB_2(rXs_1.class);
   public static rrxG_2 U = new rrxG_2(D, "getTags");
   public static rrxB_2 e = new rrxB_2("net.minecraftforge.common.ForgeHooks");
   public static rrxG_2 a = new rrxG_2(e, "onDifficultyChange");
   public static rrxG_2 i = new rrxG_2(e, "onLivingAttack");
   public static rrxG_2 rr = new rrxG_2(e, "onLivingDeath");
   public static rrxG_2 rP = new rrxG_2(e, "onLivingDrops");
   public static rrxG_2 rB = new rrxG_2(e, "onLivingFall");
   public static rrxG_2 rS = new rrxG_2(e, "onLivingHurt");
   public static rrxG_2 rs = new rrxG_2(e, "onLivingJump");
   public static rrxG_2 rE = new rrxG_2(e, "onLivingSetAttackTarget");
   public static rrxG_2 rG = new rrxG_2(e, "onLivingUpdate");
   public static rrxB_2 rb = new rrxB_2("net.minecraftforge.client.ForgeHooksClient");
   public static rrxG_2 rM = new rrxG_2(rb, "bossBarRenderPre");
   public static rrxG_2 rO = new rrxG_2(rb, "bossBarRenderPost");
   public static rrxG_2 rh = new rrxG_2(rb, "dispatchRenderLast", new Class[]{yX_2.class, Ml_1.class, float.class, rjV_2.class, long.class});
   public static rrxG_2 rX = new rrxG_2(rb, "drawItemLayered");
   public static rrxG_2 rJ = new rrxG_2(rb, "drawScreen");
   public static rrxG_2 rx = new rrxG_2(rb, "fillNormal");
   public static rrxG_2 rd = new rrxG_2(rb, "fireKeyInput");
   public static rrxG_2 rk = new rrxG_2(rb, "handleCameraTransforms");
   public static rrxG_2 rW = new rrxG_2(rb, "handlePerspective");
   public static rrxG_2 rz = new rrxG_2(rb, "gatherFluidTextures");
   public static rrxG_2 rQ = new rrxG_2(rb, "getArmorModel");
   public static rrxG_2 rN = new rrxG_2(rb, "getArmorTexture");
   public static rrxG_2 rc = new rrxG_2(rb, "getFluidSprites");
   public static rrxG_2 ru = new rrxG_2(rb, "getFogDensity");
   public static rrxG_2 rm = new rrxG_2(rb, "getFOVModifier");
   public static rrxG_2 rZ = new rrxG_2(rb, "getOffsetFOV");
   public static rrxG_2 rv = new rrxG_2(rb, "isNameplateInRenderDistance");
   public static rrxG_2 rF = new rrxG_2(rb, "loadEntityShader");
   public static rrxG_2 rL = new rrxG_2(rb, "onCameraSetup");
   public static rrxG_2 rA = new rrxG_2(rb, "onDrawBlockHighlight");
   public static rrxG_2 rn = new rrxG_2(rb, "onFogRender");
   public static rrxG_2 rC = new rrxG_2(rb, "onGuiCharTypedPre");
   public static rrxG_2 rl = new rrxG_2(rb, "onGuiCharTypedPost");
   public static rrxG_2 rH = new rrxG_2(rb, "onGuiKeyPressedPre");
   public static rrxG_2 ry = new rrxG_2(rb, "onGuiKeyPressedPost");
   public static rrxG_2 rp = new rrxG_2(rb, "onGuiKeyReleasedPre");
   public static rrxG_2 rq = new rrxG_2(rb, "onGuiKeyReleasedPost");
   public static rrxG_2 rT = new rrxG_2(rb, "onScreenshot");
   public static rrxG_2 rt = new rrxG_2(rb, "onTextureStitchedPre");
   public static rrxG_2 rw = new rrxG_2(rb, "onTextureStitchedPost");
   public static rrxG_2 rI = new rrxG_2(rb, "renderMainMenu", new Class[]{vB_2.class, Ml_1.class, cm_3.class, int.class, int.class, int.class});
   public static rrxG_2 rf = new rrxG_2(rb, "renderSpecificFirstPersonHand");
   public static rrxG_2 rj = new rrxG_2(rb, "setRenderLayer");
   public static rrxG_2 rV = new rrxG_2(rb, "shouldCauseReequipAnimation");
   public static rrxB_2 rg = new rrxB_2("net.minecraftforge.common.ForgeConfig");
   public static rrxs_3 rR = new rrxs_3(rg, "CLIENT");
   public static rrxB_2 rY = new rrxB_2("net.minecraftforge.common.ForgeConfig$Client");
   public static rrxs_3 ro = new rrxs_3(rY, "forgeLightPipelineEnabled");
   public static rrxs_3 rK = new rrxs_3(rY, "useCombinedDepthStencilAttachment");
   public static rrxB_2 rD = new rrxB_2("net.minecraftforge.common.ForgeConfigSpec");
   public static rrxs_3 rU = new rrxs_3(rD, "childConfig");
   public static rrxB_2 re = new rrxB_2("net.minecraftforge.common.ForgeConfigSpec$ConfigValue");
   public static rrxs_3 ra = new rrxs_3(re, "defaultSupplier");
   public static rrxs_3 ri = new rrxs_3(re, "spec");
   public static rrxG_2 Pr = new rrxG_2(re, "get");
   public static rrxB_2 PP = new rrxB_2(roC_2.class);
   public static rrxG_2 PB = new rrxG_2(PP, "getWorldForge");
   public static rrxB_2 PS = new rrxB_2("net.minecraftforge.common.extensions.IForgeItem");
   public static rrxG_2 Ps = new rrxG_2(PS, "getDurabilityForDisplay");
   public static rrxG_2 PE = new rrxG_2(PS, "getEquipmentSlot");
   public static rrxG_2 PG = new rrxG_2(PS, "getFontRenderer");
   public static rrxG_2 Pb = new rrxG_2(PS, "getItemStackTileEntityRenderer");
   public static rrxG_2 PM = new rrxG_2(PS, "getRGBDurabilityForDisplay");
   public static rrxG_2 PO = new rrxG_2(PS, "isDamageable", new Class[]{rdn_3.class});
   public static rrxG_2 Ph = new rrxG_2(PS, "isShield");
   public static rrxG_2 PX = new rrxG_2(PS, "onEntitySwing");
   public static rrxG_2 PJ = new rrxG_2(PS, "shouldCauseReequipAnimation");
   public static rrxG_2 Px = new rrxG_2(PS, "showDurabilityBar");
   public static rrxB_2 Pd = new rrxB_2("net.minecraftforge.common.extensions.IForgeItemStack");
   public static rrxG_2 Pk = new rrxG_2(Pd, "canDisableShield");
   public static rrxG_2 PW = new rrxG_2(Pd, "getEquipmentSlot");
   public static rrxG_2 Pz = new rrxG_2(Pd, "getShareTag");
   public static rrxG_2 PQ = new rrxG_2(Pd, "getHighlightTip");
   public static rrxG_2 PN = new rrxG_2(Pd, "isShield");
   public static rrxG_2 Pc = new rrxG_2(Pd, "readShareTag");
   public static rrxB_2 Pu = new rrxB_2(rlc_3.class);
   public static rrxG_2 Pm = Pu.id_class("createOptional", new Class[]{rqO_2.class});
   public static rrxB_2 PZ = new rrxB_2("net.minecraftforge.fml.ForgeI18n");
   public static rrxG_2 Pv = new rrxG_2(PZ, "loadLanguageData");
   public static rrxB_2 PF = new rrxB_2(Vu_1.class);
   public static rrxG_2 PL = new rrxG_2(PF, "setKeyConflictContext");
   public static rrxG_2 PA = new rrxG_2(PF, "setKeyModifierAndCode");
   public static rrxG_2 Pn = new rrxG_2(PF, "getKeyModifier");
   public static rrxB_2 PC = new rrxB_2("net.minecraftforge.common.extensions.IForgeEffectInstance");
   public static rrxG_2 Pl = new rrxG_2(PC, "isCurativeItem");
   public static rrxG_2 PH = new rrxG_2(PC, "shouldRenderHUD");
   public static rrxG_2 Py = PC.id_break("renderHUDEffect");
   public static rrxB_2 Pp = new rrxB_2("net.minecraftforge.registries.ForgeRegistryEntry");
   public static rrxG_2 Pq = new rrxG_2(Pp, "getRegistryName");
   public static rrxB_2 PT = new rrxB_2(yS_2.class);
   public static rrxG_2 Pt = new rrxG_2(PT, "canRenderInLayer", new Class[]{xc_3.class, HU.class});
   public static rrxG_2 Pw = new rrxG_2(PT, "canRenderInLayer", new Class[]{rXE.class, HU.class});
   public static rrxB_2 PI = new rrxB_2(rrEF.class);
   public static rrxS_2 Pf = PI.id_class(new Class[]{rrEl_1.class, int.class, Object.class, boolean.class});
   public static rrxG_2 Pj = PI.id_break("isForceTicks");
   public static rrxB_2 PV = new rrxB_2("net.minecraftforge.common.extensions.IForgeTileEntity");
   public static rrxG_2 Pg = new rrxG_2(PV, "getRenderBoundingBox");
   public static rrxs_3 PR = new rrxs_3(new rrJe_1(rYB.class, new Class[]{List.class}, Set.class, new Class[]{Thread.class}, "World.tileEntitiesToBeRemoved"));
   public static rrxB_2 PY = new rrxB_2(gF_2.class);
   public static rrxG_2 Po = PY.id_break("getCloudRenderHandler");
   public static rrxG_2 PK = PY.id_break("getSkyRenderHandler");
   public static rrxG_2 PD = PY.id_break("getWeatherParticleRenderHandler");
   public static rrxG_2 PU = PY.id_break("getWeatherRenderHandler");
   public static rrxB_2 Pe = new rrxB_2("net.minecraftforge.client.IRenderHandler");
   public static rrxG_2 Pa = new rrxG_2(Pe, "render");
   public static rrxB_2 Pi = new rrxB_2("net.minecraftforge.client.ItemModelMesherForge");
   public static rrxS_2 Br = new rrxS_2(Pi, new Class[]{Ip_1.class});
   public static rrxB_2 BP = new rrxB_2("net.minecraftforge.client.settings.KeyConflictContext");
   public static rrxs_3 BB = new rrxs_3(BP, "IN_GAME");
   public static rrxB_2 BS = new rrxB_2("net.minecraftforge.client.settings.KeyModifier");
   public static rrxG_2 Bs = new rrxG_2(BS, "valueFromString");
   public static rrxs_3 BE = new rrxs_3(BS, "NONE");
   public static rrxB_2 BG = new rrxB_2("net.minecraft.launchwrapper.Launch");
   public static rrxs_3 Bb = new rrxs_3(BG, "blackboard");
   public static rrxB_2 BM = new rrxB_2("net.minecraftforge.client.model.pipeline.LightUtil");
   public static rrxs_3 BO = new rrxs_3(BM, "itemConsumer");
   public static rrxs_3 Bh = new rrxs_3(BM, "tessellator");
   public static rrxG_2 BX = new rrxG_2(BM, "putBakedQuad");
   public static rrxB_2 BJ = new rrxB_2("net.minecraftforge.fml.common.Loader");
   public static rrxG_2 Bx = new rrxG_2(BJ, "getActiveModList");
   public static rrxG_2 Bd = new rrxG_2(BJ, "instance");
   public static rrxB_2 Bk = new rrxB_2("net.minecraftforge.common.MinecraftForge");
   public static rrxs_3 BW = new rrxs_3(Bk, "EVENT_BUS");
   public static rrxB_2 Bz = new rrxB_2("net.minecraftforge.client.MinecraftForgeClient");
   public static rrxG_2 BQ = new rrxG_2(Bz, "getImageLayer");
   public static rrxB_2 BN = new rrxB_2("net.minecraftforge.fml.common.ModContainer");
   public static rrxG_2 Bc = new rrxG_2(BN, "getModId");
   public static rrxB_2 Bu = new rrxB_2("net.minecraftforge.client.model.ModelLoaderRegistry");
   public static rrxG_2 Bm = Bu.id_break("onModelLoadingStart");
   public static rrxB_2 BZ = new rrxB_2("net.minecraftforge.fml.client.gui.screen.ModListScreen");
   public static rrxS_2 Bv = new rrxS_2(BZ, new Class[]{vm_3.class});
   public static rrxB_2 BF = new rrxB_2("net.minecraftforge.client.gui.NotificationModUpdateScreen");
   public static rrxG_2 BL = new rrxG_2(BF, "init", new Class[]{vB_2.class, LF.class});
   public static rrxB_2 BA = new rrxB_2("net.minecraftforge.entity.PartEntity");
   public static rrxB_2 Bn = new rrxB_2("net.minecraftforge.event.entity.PlaySoundAtEntityEvent");
   public static rrxG_2 BC = new rrxG_2(Bn, "getSound");
   public static rrxG_2 Bl = new rrxG_2(Bn, "getCategory");
   public static rrxG_2 BH = new rrxG_2(Bn, "getVolume");
   public static rrxB_2 By = new rrxB_2("net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType");
   public static rrxs_3 Bp = new rrxs_3(By, "BLOCK");
   public static rrxB_2 Bq = new rrxB_2("net.minecraftforge.fml.client.registry.RenderingRegistry");
   public static rrxG_2 BT = new rrxG_2(Bq, "loadEntityRenderers", new Class[]{pg_3.class});
   public static rrxB_2 Bt = new rrxB_2("net.minecraftforge.client.event.RenderGameOverlayEvent$BossInfo");
   public static rrxG_2 Bw = Bt.id_break("getIncrement");
   public static rrxB_2 BI = new rrxB_2("net.minecraftforge.client.event.RenderItemInFrameEvent");
   public static rrxS_2 Bf = new rrxS_2(BI, new Class[]{rsG_2.class, qh_3.class, Ml_1.class, Hx_1.class, int.class});
   public static rrxB_2 Bj = new rrxB_2("net.minecraftforge.client.event.RenderLivingEvent$Pre");
   public static rrxS_2 BV = new rrxS_2(Bj, new Class[]{iB_2.class, qd_3.class, float.class, Ml_1.class, Hx_1.class, int.class});
   public static rrxB_2 Bg = new rrxB_2("net.minecraftforge.client.event.RenderLivingEvent$Post");
   public static rrxS_2 BR = new rrxS_2(Bg, new Class[]{iB_2.class, qd_3.class, float.class, Ml_1.class, Hx_1.class, int.class});
   public static rrxB_2 BY = new rrxB_2("net.minecraftforge.client.event.RenderNameplateEvent");
   public static rrxS_2 Bo = new rrxS_2(BY, new Class[]{an_3.class, rgP_2.class, pV_2.class, Ml_1.class, Hx_1.class, int.class, float.class});
   public static rrxG_2 BK = new rrxG_2(BY, "getContent");
   public static rrxB_2 BD = new rrxB_2("net.minecraftforge.client.event.ScreenshotEvent");
   public static rrxG_2 BU = new rrxG_2(BD, "getCancelMessage");
   public static rrxG_2 Be = new rrxG_2(BD, "getScreenshotFile");
   public static rrxG_2 Ba = new rrxG_2(BD, "getResultMessage");
   public static rrxB_2 Bi = new rrxB_2("net.minecraftforge.fml.server.ServerLifecycleHooks");
   public static rrxG_2 Sr = new rrxG_2(Bi, "handleServerAboutToStart");
   public static rrxG_2 SP = new rrxG_2(Bi, "handleServerStarting");
   public static rrxB_2 SB = new rrxB_2("net.minecraftforge.event.world.WorldEvent$Load");
   public static rrxS_2 SS = new rrxS_2(SB, new Class[]{rRg_1.class});
   private static boolean Gt = id_class("*** Reflector Vanilla ***");
   public static rrxB_2 Ss = new rrxB_2(rsE_2.class);
   public static rrxs_3 SE = new rrxs_3(Ss, rut_3.class);
   public static rrxB_2 SG = new rrxB_2(pw_3.class);
   public static rrxs_3 Sb = new rrxs_3(SG, pI_2.class);
   public static rrxB_2 SM = new rrxB_2(Zn_1.class);
   public static rrxs_3 SO = new rrxs_3(SM, tm_3.class);
   public static rrxB_2 Sh = new rrxB_2(vB_2.class);
   public static rrxs_3 SX = new rrxs_3(Sh, String.class);
   public static rrxB_2 SJ = new rrxB_2(IZ.class);
   public static rrxs_3 Sx = new rrxs_3(SJ, Map.class);
   public static rrxB_2 Sd = new rrxB_2(jg_3.class);
   public static rrxs_3 Sk = new rrxs_3(Sd, rAC.class);
   public static rrxB_2 SW = new rrxB_2(jR_2.class);
   public static rrxs_3 Sz = new rrxs_3(SW, rAC.class);
   public static rrxB_2 SQ = new rrxB_2(TV.class);
   public static rrxs_3 SN = new rrxs_3(SQ, te_3.class);
   public static rrxB_2 Sc = new rrxB_2(QY.class);
   public static rrxs_3 Su = new rrxs_3(Sc, ub_3.class);
   public static rrxB_2 Sm = new rrxB_2(tg_3.class);
   public static rrxs_3 SZ = new rrxs_3(Sm, Iq_1.class);
   public static rrxB_2 Sv = new rrxB_2(tx_3.class);
   public static rrxE_2 SF = new rrxE_2(Sv, Iq_1.class, 4);
   public static rrxB_2 SL = new rrxB_2(td_3.class);
   public static rrxE_2 SA = new rrxE_2(SL, Iq_1.class, 6);
   public static rrxB_2 Sn = new rrxB_2(tk_3.class);
   public static rrxE_2 SC = new rrxE_2(Sn, Iq_1.class, 10);
   public static rrxB_2 Sl = new rrxB_2(tN_2.class);
   public static rrxs_3 SH = new rrxs_3(Sl, Iq_1.class);
   public static rrxs_3 Sy = new rrxs_3(Sl, Iq_1[].class);
   public static rrxB_2 Sp = new rrxB_2(tc_3.class);
   public static rrxE_2 Sq = new rrxE_2(Sp, Iq_1.class, 9);
   public static rrxB_2 ST = new rrxB_2(tm_3.class);
   public static rrxE_2 St = new rrxE_2(ST, Iq_1.class, 7);
   public static rrxs_3 Sw = new rrxs_3(ST, List.class);
   public static rrxB_2 SI = new rrxB_2(tv_3.class);
   public static rrxE_2 Sf = new rrxE_2(SI, Iq_1.class, 8);
   public static rrxB_2 Sj = new rrxB_2(tF_2.class);
   public static rrxE_2 SV = new rrxE_2(Sj, Iq_1.class, 7);
   public static rrxB_2 Sg = new rrxB_2(tA_2.class);
   public static rrxE_2 SR = new rrxE_2(Sg, Iq_1.class, 7);
   public static rrxB_2 SY = new rrxB_2(pI_2.class);
   public static rrxE_2 So = new rrxE_2(SY, Iq_1.class, 20);
   public static rrxB_2 SK = new rrxB_2(pt_3.class);
   public static rrxE_2 SD = new rrxE_2(SK, Iq_1.class, 3);
   public static rrxB_2 SU = new rrxB_2(ty_3.class);
   public static rrxs_3 Se = new rrxs_3(SU, Iq_1[].class);
   public static rrxB_2 Sa = new rrxB_2(tq_3.class);
   public static rrxE_2 Si = new rrxE_2(Sa, Iq_1.class, 3);
   public static rrxB_2 sr = new rrxB_2(tf_3.class);
   public static rrxs_3 sP = new rrxs_3(sr, Iq_1.class, 0);
   public static rrxs_3 sB = new rrxs_3(sr, Iq_1.class, 1);
   public static rrxs_3 sS = new rrxs_3(sr, Iq_1[].class, 0);
   public static rrxs_3 ss = new rrxs_3(sr, Iq_1[].class, 1);
   public static rrxB_2 sE = new rrxB_2(jQ_2.class);
   public static rrxs_3 sG = new rrxs_3(sE, Iq_1.class, 0);
   public static rrxs_3 sb = new rrxs_3(sE, Iq_1.class, 1);
   public static rrxB_2 sM = new rrxB_2(tV_2.class);
   public static rrxE_2 sO = new rrxE_2(sM, Iq_1.class, 11);
   public static rrxB_2 sh = new rrxB_2(tj_3.class);
   public static rrxE_2 sX = new rrxE_2(sh, Iq_1.class, 2);
   public static rrxB_2 sJ = new rrxB_2(tK_2.class);
   public static rrxE_2 sx = new rrxE_2(sJ, Iq_1.class, 8);
   public static rrxB_2 sd = new rrxB_2(tD_2.class);
   public static rrxE_2 sk = new rrxE_2(sd, Iq_1.class, 6);
   public static rrxB_2 sW = new rrxB_2(tT_2.class);
   public static rrxE_2 sz = new rrxE_2(sW, Iq_1.class, 10);
   public static rrxB_2 sQ = new rrxB_2(tU_2.class);
   public static rrxs_3 sN = new rrxs_3(sQ, Iq_1.class);
   public static rrxB_2 sc = new rrxB_2(qJ_2.class);
   public static rrxs_3 su = new rrxs_3(sc, tU_2.class);
   public static rrxB_2 sm = new rrxB_2(te_3.class);
   public static rrxE_2 sZ = new rrxE_2(sm, Iq_1.class, 8);
   public static rrxB_2 sv = new rrxB_2(ta_3.class);
   public static rrxs_3 sF = new rrxs_3(sv, Iq_1.class);
   public static rrxB_2 sL = new rrxB_2(wr_3.class);
   public static rrxs_3 sA = new rrxs_3(sL, Iq_1[].class);
   public static rrxB_2 sn = new rrxB_2(ti_3.class);
   public static rrxs_3 sC = new rrxs_3(sn, Iq_1.class);
   public static rrxs_3 sl = new rrxs_3(sn, Iq_1[].class);
   public static rrxB_2 sH = new rrxB_2(wB_2.class);
   public static rrxE_2 sy = new rrxE_2(sH, Iq_1.class, 8);
   public static rrxB_2 sp = new rrxB_2(wb_3.class);
   public static rrxE_2 sq = new rrxE_2(sp, Iq_1.class, 7);
   public static rrxB_2 sT = new rrxB_2(ws_3.class);
   public static rrxE_2 st = new rrxE_2(sT, Iq_1.class, 11);
   public static rrxB_2 sw = new rrxB_2(wJ_2.class);
   public static rrxE_2 sI = new rrxE_2(sw, Iq_1.class, 13);
   public static rrxB_2 sf = new rrxB_2(wx_3.class);
   public static rrxE_2 sj = new rrxE_2(sf, Iq_1.class, 11);
   public static rrxB_2 sV = new rrxB_2(wd_3.class);
   public static rrxE_2 sg = new rrxE_2(sV, Iq_1.class, 6);
   public static rrxB_2 sR = new rrxB_2(wk_3.class);
   public static rrxE_2 sY = new rrxE_2(sR, Iq_1.class, 6);
   public static rrxB_2 so = new rrxB_2(wW_2.class);
   public static rrxE_2 sK = new rrxE_2(so, Iq_1.class, 12);
   public static rrxB_2 sD = new rrxB_2(wz_3.class);
   public static rrxE_2 sU = new rrxE_2(sD, Iq_1.class, 8);
   public static rrxB_2 se = new rrxB_2(wQ_2.class);
   public static rrxE_2 sa = new rrxE_2(se, Iq_1.class, 5);
   public static rrxB_2 si = new rrxB_2(wv_3.class);
   public static rrxE_2 Er = new rrxE_2(si, Iq_1.class, 3);
   public static rrxB_2 EP = new rrxB_2(wZ_2.class);
   public static rrxs_3 EB = new rrxs_3(EP, Iq_1.class);
   public static rrxB_2 ES = new rrxB_2(jJ_2.class);
   public static rrxE_2 Es = new rrxE_2(ES, Iq_1.class, 2);
   public static rrxB_2 EE = new rrxB_2(tt_3.class);
   public static rrxs_3 EG = new rrxs_3(EE, Iq_1.class);
   public static rrxB_2 Eb = new rrxB_2(wF_2.class);
   public static rrxs_3 EM = new rrxs_3(Eb, Iq_1[].class, 0);
   public static rrxs_3 EO = new rrxs_3(Eb, Iq_1[].class, 1);
   public static rrxB_2 Eh = new rrxB_2(wA_2.class);
   public static rrxE_2 EX = new rrxE_2(Eh, Iq_1.class, 4);
   public static rrxB_2 EJ = new rrxB_2(wn_3.class);
   public static rrxE_2 Ex = new rrxE_2(EJ, Iq_1.class, 5);
   public static rrxB_2 Ed = new rrxB_2(wC_2.class);
   public static rrxE_2 Ek = new rrxE_2(Ed, Iq_1.class, 11);
   public static rrxB_2 EW = new rrxB_2(wl_3.class);
   public static rrxs_3 Ez = new rrxs_3(EW, Iq_1.class);
   public static rrxs_3 EQ = new rrxs_3(EW, Iq_1[].class);
   public static rrxB_2 EN = new rrxB_2(wH_2.class);
   public static rrxE_2 Ec = new rrxE_2(EN, Iq_1.class, 9);
   public static rrxB_2 Eu = new rrxB_2(wp_3.class);
   public static rrxs_3 Em = new rrxs_3(Eu, Iq_1.class);
   public static rrxB_2 EZ = new rrxB_2(wq_3.class);
   public static rrxE_2 Ev = new rrxE_2(EZ, Iq_1.class, 5);
   public static rrxB_2 EF = new rrxB_2(wT_2.class);
   public static rrxE_2 EL = new rrxE_2(EF, Iq_1.class, 6);
   public static rrxB_2 EA = new rrxB_2(wt_3.class);
   public static rrxs_3 En = new rrxs_3(EA, Iq_1.class, 0);
   public static rrxB_2 EC = new rrxB_2(ww_3.class);
   public static rrxs_3 El = new rrxs_3(EC, Iq_1.class, 0);
   public static rrxs_3 EH = new rrxs_3(EC, Iq_1.class, 1);
   public static rrxB_2 Ey = new rrxB_2(wI_2.class);
   public static rrxE_2 Ep = new rrxE_2(Ey, Iq_1.class, 9);
   public static rrxB_2 Eq = new rrxB_2(wf_3.class);
   public static rrxs_3 ET = new rrxs_3(Eq, Iq_1.class, 0);
   public static rrxB_2 Et = new rrxB_2(wj_3.class);
   public static rrxs_3 Ew = new rrxs_3(Et, Iq_1[].class, 0);
   public static rrxs_3 EI = new rrxs_3(Et, Iq_1[].class, 1);
   public static rrxB_2 Ef = new rrxB_2(wV_2.class);
   public static rrxE_2 Ej = new rrxE_2(Ef, Iq_1.class, 10);
   public static rrxB_2 EV = new rrxB_2(pv_3.class);
   public static rrxs_3 Eg = new rrxs_3(EV, tu_3.class);
   public static rrxB_2 ER = new rrxB_2(pR_2.class);
   public static rrxs_3 EY = new rrxs_3(ER, tq_3.class);
   public static rrxB_2 Eo = new rrxB_2(qz_3.class);
   public static rrxs_3 EK = new rrxs_3(Eo, ta_3.class);
   public static rrxB_2 ED = new rrxB_2(qy_3.class);
   public static rrxs_3 EU = new rrxs_3(ED, wd_3.class);
   public static rrxs_3 Ee = new rrxs_3(ED, wx_3.class);
   public static rrxs_3 Ea = new rrxs_3(ED, wJ_2.class);
   public static rrxB_2 Ei = new rrxB_2(qN_2.class);
   public static rrxs_3 Gr = new rrxs_3(Ei, tp_3.class);
   public static rrxB_2 GP = new rrxB_2(qw_3.class);
   public static rrxs_3 GB = new rrxs_3(GP, wZ_2.class);
   public static rrxB_2 GS = new rrxB_2(Tr_1.class);
   public static rrxs_3 Gs = new rrxs_3(GS, wp_3.class);
   public static rrxB_2 GE = new rrxB_2(TP.class);
   public static rrxs_3 GG = new rrxs_3(GE, wq_3.class);
   public static rrxs_3 Gb = new rrxs_3(GE, wT_2.class);
   public static rrxB_2 GM = new rrxB_2(TJ.class);
   public static rrxs_3 GO = new rrxs_3(GM, tt_3.class);
   public static rrxB_2 Gh = new rrxB_2(fD_2.class);
   public static rrxE_2 GX = new rrxE_2(Gh, Iq_1.class, 3);
   public static rrxB_2 GJ = new rrxB_2(fe_3.class);
   public static rrxs_3 Gx = new rrxs_3(GJ, Iq_1.class, 0);
   public static rrxs_3 Gd = new rrxs_3(GJ, Iq_1.class, 1);
   public static rrxs_3 Gk = new rrxs_3(GJ, Iq_1[].class);
   public static rrxB_2 GW = new rrxB_2(fa_3.class);
   public static rrxs_3 Gz = new rrxs_3(GW, Iq_1.class);
   public static rrxB_2 GQ = new rrxB_2(rHO.class);
   public static rrxs_3 GN = new rrxs_3(GQ, rgP_2.class);
   public static rrxB_2 Gc = new rrxB_2(jr_3.class);
   public static rrxE_2 Gu = new rrxE_2(Gc, Iq_1.class, 9);
   public static rrxB_2 Gm = new rrxB_2(jP_2.class);
   public static rrxE_2 GZ = new rrxE_2(Gm, Iq_1.class, 4);
   public static rrxB_2 Gv = new rrxB_2(jS_2.class);
   public static rrxs_3 GF = new rrxs_3(Gv, tm_3.class);
   public static rrxB_2 GL = new rrxB_2(jb_3.class);
   public static rrxs_3 GA = new rrxs_3(GL, tm_3.class);
   public static rrxB_2 Gn = new rrxB_2(jh_3.class);
   public static rrxs_3 GC = new rrxs_3(Gn, wv_3.class);
   public static rrxB_2 Gl = new rrxB_2(jX_2.class);
   public static rrxs_3 GH = new rrxs_3(Gl, jJ_2.class);
   public static rrxB_2 Gy = new rrxB_2(jx_3.class);
   public static rrxs_3 Gp = new rrxs_3(Gy, Map.class, 0);

   public static int id_byte(rrxG_2 var0, Object... var1) {
      try {
         Method var2 = var0.id_break();
         if (var2 == null) {
            return 0;
         } else {
            Integer var3 = (Integer)var2.invoke(null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         id_class(var4, null, var0, var1);
         return 0;
      }
   }

   public static int id_byte(Object var0, rrxG_2 var1, Object... var2) {
      try {
         Method var3 = var1.id_break();
         if (var3 == null) {
            return 0;
         } else {
            Integer var4 = (Integer)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         id_class(var5, var0, var1, var2);
         return 0;
      }
   }

   public static long id_class(Object var0, rrxs_3 var1, long var2) {
      try {
         Field var4 = var1.id_break();
         return var4 == null ? var2 : var4.getLong(var0);
      } catch (Throwable var5) {
         rrMP.id_break("", var5);
         return var2;
      }
   }

   public static boolean id_class(rrxs_3 var0, Object var1) {
      return id_class(null, var0, var1);
   }

   public static boolean id_class(Object var0, rrxE_2 var1, int var2, Object var3) {
      rrxs_3 var4 = var1.id_class(var2);
      if (var4 == null) {
         return false;
      } else {
         id_class(var0, var4, var3);
         return true;
      }
   }

   public static boolean id_class(Object var0, rrxs_3 var1, Object var2) {
      try {
         Field var3 = var1.id_break();
         if (var3 == null) {
            return false;
         } else {
            var3.set(var0, var2);
            return true;
         }
      } catch (Throwable var4) {
         rrMP.id_break("", var4);
         return false;
      }
   }

   public static Object id_class(rrxS_2 var0, Object... var1) {
      Constructor var2 = var0.id_break();
      if (var2 == null) {
         return null;
      } else {
         try {
            return var2.newInstance(var1);
         } catch (Throwable var4) {
            id_class(var4, var0, var1);
            return null;
         }
      }
   }

   public static void id_class(rrxG_2 var0, Object... var1) {
      try {
         Method var2 = var0.id_break();
         if (var2 == null) {
            return;
         }

         var2.invoke(null, var1);
      } catch (Throwable var3) {
         id_class(var3, null, var0, var1);
      }
   }

   public static float id_class(Object var0, rrxs_3 var1, float var2) {
      try {
         Field var3 = var1.id_break();
         return var3 == null ? var2 : var3.getFloat(var0);
      } catch (Throwable var4) {
         rrMP.id_break("", var4);
         return var2;
      }
   }

   public static Object id_class(Object var0, rrxE_2 var1, int var2) {
      rrxs_3 var3 = var1.id_class(var2);
      return var3 == null ? null : id_class(var0, var3);
   }

   public static int id_class(Object var0, rrxs_3 var1, int var2) {
      try {
         Field var3 = var1.id_break();
         return var3 == null ? var2 : var3.getInt(var0);
      } catch (Throwable var4) {
         rrMP.id_break("", var4);
         return var2;
      }
   }

   private static void id_class(Throwable var0, Object var1, rrxG_2 var2, Object[] var3) {
      if (var0 instanceof InvocationTargetException) {
         if (var0.getCause() instanceof RuntimeException var5) {
            throw var5;
         }

         rrMP.id_break("", var0);
      } else {
         rrMP.id_byte("*** Exception outside of method ***");
         rrMP.id_byte("Method deactivated: " + var2.id_break());
         var2.id_throws();
         if (var0 instanceof IllegalArgumentException) {
            rrMP.id_byte("*** IllegalArgumentException ***");
            rrMP.id_byte("Method: " + var2.id_break());
            rrMP.id_byte("Object: " + var1);
            rrMP.id_byte("Parameter classes: " + rrki_1.id_class(id_class(var3)));
            rrMP.id_byte("Parameters: " + rrki_1.id_class(var3));
         }

         rrMP.id_class("", var0);
      }
   }

   private static void id_class(Throwable var0, rrxS_2 var1, Object[] var2) {
      if (var0 instanceof InvocationTargetException) {
         rrMP.id_break("", var0);
      } else {
         rrMP.id_byte("*** Exception outside of constructor ***");
         rrMP.id_byte("Constructor deactivated: " + var1.id_break());
         var1.id_protected();
         if (var0 instanceof IllegalArgumentException) {
            rrMP.id_byte("*** IllegalArgumentException ***");
            rrMP.id_byte("Constructor: " + var1.id_break());
            rrMP.id_byte("Parameter classes: " + rrki_1.id_class(id_class(var2)));
            rrMP.id_byte("Parameters: " + rrki_1.id_class(var2));
         }

         rrMP.id_class("", var0);
      }
   }

   private static Object[] id_class(Object[] var0) {
      if (var0 == null) {
         return new Class[0];
      } else {
         Class[] var1 = new Class[var0.length];

         for (int var2 = 0; var2 < var1.length; var2++) {
            Object var3 = var0[var2];
            if (var3 != null) {
               var1[var2] = var3.getClass();
            }
         }

         return var1;
      }
   }

   private static rrxs_3[] id_class(rrxB_2 var0, Class var1, int var2) {
      rrxs_3[] var3 = new rrxs_3[var2];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = new rrxs_3(var0, var1, var4);
      }

      return var3;
   }

   private static boolean id_class(String var0) {
      rrxP_2 var2 = new rrxP_2(var0);
      rrxM_2.id_class(var2);
      return true;
   }

   public static boolean id_class(Class[] var0, Class[] var1) {
      if (var0.length != var1.length) {
         return false;
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            Class var3 = var0[var2];
            Class var4 = var1[var2];
            if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   private static void id_class(boolean var0, String var1, rrxG_2 var2, Object[] var3, Object var4) {
      String var5 = var2.id_break().getDeclaringClass().getName();
      String var6 = var2.id_break().getName();
      String var7 = "";
      if (var0) {
         var7 = " static";
      }

      rrMP.id_break(var1 + var7 + " " + var5 + "." + var6 + "(" + rrki_1.id_class(var3) + ") => " + var4);
   }

   private static void id_class(boolean var0, String var1, rrxG_2 var2, Object[] var3) {
      String var4 = var2.id_break().getDeclaringClass().getName();
      String var5 = var2.id_break().getName();
      String var6 = "";
      if (var0) {
         var6 = " static";
      }

      rrMP.id_break(var1 + var6 + " " + var4 + "." + var5 + "(" + rrki_1.id_class(var3) + ")");
   }

   private static void id_class(boolean var0, String var1, rrxs_3 var2, Object var3) {
      String var4 = var2.id_break().getDeclaringClass().getName();
      String var5 = var2.id_break().getName();
      String var6 = "";
      if (var0) {
         var6 = " static";
      }

      rrMP.id_break(var1 + var6 + " " + var4 + "." + var5 + " => " + var3);
   }

   public static int id_class(rrxs_3 var0, int var1) {
      return id_class(null, var0, var1);
   }

   public static void id_class(Object var0, rrxG_2 var1, Object... var2) {
      try {
         if (var0 == null) {
            return;
         }

         Method var3 = var1.id_break();
         if (var3 == null) {
            return;
         }

         var3.invoke(var0, var2);
      } catch (Throwable var4) {
         id_class(var4, var0, var1, var2);
      }
   }

   public static Object id_class(rrxs_3 var0) {
      return id_class(null, var0);
   }

   public static Object id_class(rrxE_2 var0, int var1) {
      rrxs_3 var2 = var0.id_class(var1);
      return var2 == null ? null : id_class(var2);
   }

   public static boolean id_class(Object var0, rrxs_3 var1, boolean var2) {
      try {
         Field var3 = var1.id_break();
         return var3 == null ? var2 : var3.getBoolean(var0);
      } catch (Throwable var4) {
         rrMP.id_break("", var4);
         return var2;
      }
   }

   public static Object id_class(Object var0, rrxs_3 var1) {
      try {
         Field var2 = var1.id_break();
         return var2 == null ? null : var2.get(var0);
      } catch (Throwable var3) {
         rrMP.id_break("", var3);
         return null;
      }
   }

   public static boolean id_break(Object var0, rrxs_3 var1, int var2) {
      try {
         Field var3 = var1.id_break();
         if (var3 == null) {
            return false;
         } else {
            var3.setInt(var0, var2);
            return true;
         }
      } catch (Throwable var4) {
         rrMP.id_break("", var4);
         return false;
      }
   }

   public static boolean id_break(rrxG_2 var0, Object... var1) {
      try {
         Method var2 = var0.id_break();
         if (var2 == null) {
            return false;
         } else {
            Boolean var3 = (Boolean)var2.invoke(null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         id_class(var4, null, var0, var1);
         return false;
      }
   }

   public static boolean id_break(Object var0, rrxG_2 var1, Object... var2) {
      try {
         Method var3 = var1.id_break();
         if (var3 == null) {
            return false;
         } else {
            Boolean var4 = (Boolean)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         id_class(var5, var0, var1, var2);
         return false;
      }
   }

   public static boolean id_break(rrxs_3 var0, int var1) {
      return id_break(null, var0, var1);
   }

   public static float id_throws(rrxG_2 var0, Object... var1) {
      try {
         Method var2 = var0.id_break();
         if (var2 == null) {
            return 0.0F;
         } else {
            Float var3 = (Float)var2.invoke(null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         id_class(var4, null, var0, var1);
         return 0.0F;
      }
   }

   public static float id_throws(Object var0, rrxG_2 var1, Object... var2) {
      try {
         Method var3 = var1.id_break();
         if (var3 == null) {
            return 0.0F;
         } else {
            Float var4 = (Float)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         id_class(var5, var0, var1, var2);
         return 0.0F;
      }
   }

   public static String id_catch(Object var0, rrxG_2 var1, Object... var2) {
      try {
         Method var3 = var1.id_break();
         return var3 == null ? null : (String)var3.invoke(var0, var2);
      } catch (Throwable var4) {
         id_class(var4, var0, var1, var2);
         return null;
      }
   }

   public static String id_catch(rrxG_2 var0, Object... var1) {
      try {
         Method var2 = var0.id_break();
         return var2 == null ? null : (String)var2.invoke(null, var1);
      } catch (Throwable var3) {
         id_class(var3, null, var0, var1);
         return null;
      }
   }

   public static double id_case(rrxG_2 var0, Object... var1) {
      try {
         Method var2 = var0.id_break();
         if (var2 == null) {
            return 0.0;
         } else {
            Double var3 = (Double)var2.invoke(null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         id_class(var4, null, var0, var1);
         return 0.0;
      }
   }

   public static double id_case(Object var0, rrxG_2 var1, Object... var2) {
      try {
         Method var3 = var1.id_break();
         if (var3 == null) {
            return 0.0;
         } else {
            Double var4 = (Double)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         id_class(var5, var0, var1, var2);
         return 0.0;
      }
   }

   public static long id_protected(rrxG_2 var0, Object... var1) {
      try {
         Method var2 = var0.id_break();
         if (var2 == null) {
            return 0L;
         } else {
            Long var3 = (Long)var2.invoke(null, var1);
            return var3;
         }
      } catch (Throwable var4) {
         id_class(var4, null, var0, var1);
         return 0L;
      }
   }

   public static long id_protected(Object var0, rrxG_2 var1, Object... var2) {
      try {
         Method var3 = var1.id_break();
         if (var3 == null) {
            return 0L;
         } else {
            Long var4 = (Long)var3.invoke(var0, var2);
            return var4;
         }
      } catch (Throwable var5) {
         id_class(var5, var0, var1, var2);
         return 0L;
      }
   }

   public static Object id_private(rrxG_2 var0, Object... var1) {
      try {
         Method var2 = var0.id_break();
         return var2 == null ? null : var2.invoke(null, var1);
      } catch (Throwable var3) {
         id_class(var3, null, var0, var1);
         return null;
      }
   }

   public static Object id_private(Object var0, rrxG_2 var1, Object... var2) {
      try {
         Method var3 = var1.id_break();
         return var3 == null ? null : var3.invoke(var0, var2);
      } catch (Throwable var4) {
         id_class(var4, var0, var1, var2);
         return null;
      }
   }
}
