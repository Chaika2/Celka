/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_extends;
import celestial.C_finally;
import celestial.C_implements;
import celestial.C_throws;
import celestial.Pb_1;
import celestial.QY;
import celestial.cq_3;
import celestial.rVe_1;
import celestial.rdb_3;
import celestial.rgP_2;
import celestial.rja_3;
import celestial.xd_3;
import celestial.xu_3;
import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_private {
    @C_implements(id_class="inventoryMoveOnlyIfStationary")
    public final C_extends<Boolean> id_class;
    @C_implements(id_class="pathRenderLineWidthPixels")
    public final C_extends<Float> id_break;
    @C_implements(id_class="placeIncorrectBlockPenaltyMultiplier")
    public final C_extends<Double> id_byte;
    @C_finally(id_class="baritone.changecommandsprefix.title", id_break="baritone.changecommandsprefix.message")
    @C_implements(id_class="prefix")
    public final C_extends<String> id_protected;
    @C_implements(id_class="pruneRegionsFromRAM")
    public final C_extends<Boolean> id_throws;
    @C_implements(id_class="buildRepeatCount")
    public final C_extends<Integer> id_case;
    @C_implements(id_class="legitMine")
    public final C_extends<Boolean> id_catch;
    @C_implements(id_class="blockFreeLook")
    public final C_extends<Boolean> id_private;
    @C_implements(id_class="logger")
    public final C_extends<Consumer<rVe_1>> id_implements;
    @C_implements(id_class="sprintInWater")
    public final C_extends<Boolean> id_finally;
    @C_implements(id_class="maxFallHeightBucket")
    public final C_extends<Integer> id_extends;
    @C_implements(id_class="shortBaritonePrefix")
    public final C_extends<Boolean> id_native;
    @C_implements(id_class="buildIgnoreDirection")
    public final C_extends<Boolean> id_volatile;
    @C_implements(id_class="pathCutoffFactor")
    public final C_extends<Double> id_final;
    @C_implements(id_class="renderSelectionIgnoreDepth")
    public final C_extends<Boolean> id_package;
    @C_implements(id_class="walkOnWaterOnePenalty")
    public final C_extends<Double> id_int;
    @C_implements(id_class="layerHeight")
    public final C_extends<Integer> id_new;
    @C_implements(id_class="avoidUpdatingFallingBlocks")
    public final C_extends<Boolean> id_continue;
    @C_implements(id_class="selectionOpacity")
    public final C_extends<Float> id_super;
    private static float[] BE;
    @C_implements(id_class="mobAvoidanceCoefficient")
    public final C_extends<Double> id_this;
    @C_implements(id_class="allowParkourAscend")
    public final C_extends<Boolean> id_else;
    @C_implements(id_class="slowPath")
    public final C_extends<Boolean> id_synchronized;
    private static boolean[] BG;
    @C_implements(id_class="cutoffAtLoadBoundary")
    public final C_extends<Boolean> id_return;
    @C_implements(id_class="allowVines")
    public final C_extends<Boolean> id_public;
    @C_implements(id_class="autoTool")
    public final C_extends<Boolean> id_goto;
    @C_implements(id_class="followOffsetDistance")
    public final C_extends<Double> id_while;
    @C_implements(id_class="colorSelection")
    public final C_extends<Color> id_try;
    @C_implements(id_class="axisHeight")
    public final C_extends<Integer> id_instanceof;
    @C_implements(id_class="chunkCaching")
    public final C_extends<Boolean> id_throw;
    @C_implements(id_class="followTargetMaxDistance")
    public final C_extends<Integer> id_interface;
    @C_implements(id_class="disconnectOnArrival")
    public final C_extends<Boolean> id_char;
    @C_implements(id_class="notificationOnExploreFinished")
    public final C_extends<Boolean> id_abstract;
    @C_implements(id_class="mobAvoidanceRadius")
    public final C_extends<Integer> id_long;
    @C_implements(id_class="colorSelectionPos2")
    public final C_extends<Color> id_float;
    @C_implements(id_class="pathHistoryCutoffAmount")
    public final C_extends<Integer> id_void;
    @C_implements(id_class="buildRepeatSneaky")
    public final C_extends<Boolean> id_static;
    @C_implements(id_class="minYLevelWhileMining")
    public final C_extends<Integer> id_import;
    @C_implements(id_class="colorSelectionPos1")
    public final C_extends<Color> id_short;
    @C_implements(id_class="movementTimeoutTicks")
    public final C_extends<Integer> id_default;
    @C_implements(id_class="renderGoalXZBeacon")
    public final C_extends<Boolean> id_const;
    @C_implements(id_class="cachedChunksExpirySeconds")
    public final C_extends<Long> id_strictfp;
    @C_implements(id_class="blockReachDistance")
    public final C_extends<Float> id_boolean;
    @C_implements(id_class="avoidance")
    public final C_extends<Boolean> id_transient;
    @C_implements(id_class="breakFromAbove")
    public final C_extends<Boolean> id_for;
    @C_implements(id_class="allowParkour")
    public final C_extends<Boolean> id_double;
    @C_implements(id_class="overshootTraverse")
    public final C_extends<Boolean> id_switch;
    @C_implements(id_class="simplifyUnloadedYCoord")
    public final C_extends<Boolean> r;
    @C_implements(id_class="enterPortal")
    public final C_extends<Boolean> P;
    @C_implements(id_class="backfill")
    public final C_extends<Boolean> B;
    @C_implements(id_class="buildSkipBlocks")
    public final C_extends<List<xd_3>> S;
    @C_implements(id_class="pathingMaxChunkBorderFetch")
    public final C_extends<Integer> s;
    @C_implements(id_class="renderPathAsLine")
    public final C_extends<Boolean> E;
    @C_implements(id_class="preferSilkTouch")
    public final C_extends<Boolean> G;
    @C_implements(id_class="exploreForBlocks")
    public final C_extends<Boolean> b;
    @C_implements(id_class="repackOnAnyBlockChange")
    public final C_extends<Boolean> M;
    @C_implements(id_class="buildInLayers")
    public final C_extends<Boolean> O;
    @C_implements(id_class="breakCorrectBlockPenaltyMultiplier")
    public final C_extends<Double> h;
    @C_implements(id_class="skipFailedLayers")
    public final C_extends<Boolean> X;
    @C_implements(id_class="renderSelection")
    public final C_extends<Boolean> J;
    @C_implements(id_class="renderPath")
    public final C_extends<Boolean> x;
    @C_implements(id_class="walkWhileBreaking")
    public final C_extends<Boolean> d;
    @C_implements(id_class="allowPlace")
    public final C_extends<Boolean> k;
    @C_implements(id_class="schematicOrientationX")
    public final C_extends<Boolean> W;
    @C_implements(id_class="allowInventory")
    public final C_extends<Boolean> z;
    @C_implements(id_class="chatControlAnyway")
    public final C_extends<Boolean> Q;
    @C_implements(id_class="remainWithExistingLookDirection")
    public final C_extends<Boolean> N;
    @C_implements(id_class="maxCachedWorldScanCount")
    public final C_extends<Integer> c;
    @C_implements(id_class="maxCostIncrease")
    public final C_extends<Double> u;
    @C_implements(id_class="notificationOnFarmFail")
    public final C_extends<Boolean> m;
    @C_implements(id_class="allowOnlyExposedOres")
    public final C_extends<Boolean> Z;
    @C_implements(id_class="schematicOrientationZ")
    public final C_extends<Boolean> v;
    @C_implements(id_class="antiCheatCompatibility")
    public final C_extends<Boolean> F;
    @C_implements(id_class="colorNextPath")
    public final C_extends<Color> L;
    @C_implements(id_class="censorCoordinates")
    public final C_extends<Boolean> A;
    @C_implements(id_class="freeLook")
    public final C_extends<Boolean> n;
    @C_implements(id_class="allowOvershootDiagonalDescend")
    public final C_extends<Boolean> C;
    @C_implements(id_class="prefixControl")
    public final C_extends<Boolean> l;
    @C_implements(id_class="planningTickLookahead")
    public final C_extends<Integer> H;
    @C_implements(id_class="doDeathWaypoints")
    public final C_extends<Boolean> y;
    @C_implements(id_class="blocksToAvoidBreaking")
    public final C_extends<List<xd_3>> p;
    @C_implements(id_class="mineDropLoiterDurationMSThanksLouca")
    public final C_extends<Long> q;
    @C_implements(id_class="followRadius")
    public final C_extends<Integer> T;
    @C_implements(id_class="randomLooking")
    public final C_extends<Double> t;
    @C_implements(id_class="planAheadPrimaryTimeoutMS")
    public final C_extends<Long> w;
    @C_implements(id_class="allowBreakAnyway")
    public final C_extends<List<xd_3>> I;
    @C_implements(id_class="farmMaxScanSize")
    public final C_extends<Integer> f;
    @C_implements(id_class="slowPathTimeoutMS")
    public final C_extends<Long> j;
    @C_implements(id_class="itemSaverThreshold")
    public final C_extends<Integer> V;
    @C_implements(id_class="renderSelectionBoxes")
    public final C_extends<Boolean> g;
    @C_implements(id_class="colorMostRecentConsidered")
    public final C_extends<Color> R;
    @C_implements(id_class="allowDiagonalDescend")
    public final C_extends<Boolean> Y;
    private static byte[] Bb;
    @C_implements(id_class="allowJumpAt256")
    public final C_extends<Boolean> o;
    @C_implements(id_class="goalBreakFromAbove")
    public final C_extends<Boolean> K;
    @C_implements(id_class="mobSpawnerAvoidanceCoefficient")
    public final C_extends<Double> D;
    @C_implements(id_class="buildSubstitutes")
    public final C_extends<Map<xd_3, List<xd_3>>> U;
    @C_implements(id_class="renderCachedChunks")
    public final C_extends<Boolean> e;
    @C_implements(id_class="pathingMapLoadFactor")
    public final C_extends<Float> a;
    @C_implements(id_class="legitMineIncludeDiagonals")
    public final C_extends<Boolean> i;
    @C_implements(id_class="assumeExternalAutoTool")
    public final C_extends<Boolean> rr;
    @C_implements(id_class="exploreMaintainY")
    public final C_extends<Integer> rP;
    @C_implements(id_class="chatControl")
    public final C_extends<Boolean> rB;
    @C_implements(id_class="useSwordToMine")
    public final C_extends<Boolean> rS;
    @C_implements(id_class="blockBreakAdditionalPenalty")
    public final C_extends<Double> rs;
    @C_implements(id_class="renderSelectionBoxesIgnoreDepth")
    public final C_extends<Boolean> rE;
    @C_implements(id_class="avoidBreakingMultiplier")
    public final C_extends<Double> rG;
    @C_implements(id_class="maxFallHeightNoWater")
    public final C_extends<Integer> rb;
    @C_implements(id_class="maxYLevelWhileMining")
    public final C_extends<Integer> rM;
    @C_implements(id_class="buildIgnoreBlocks")
    public final C_extends<List<xd_3>> rO;
    @C_implements(id_class="primaryTimeoutMS")
    public final C_extends<Long> rh;
    @C_implements(id_class="desktopNotifications")
    public final C_extends<Boolean> rX;
    @C_implements(id_class="allowWaterBucketFall")
    public final C_extends<Boolean> rJ;
    @C_implements(id_class="legitMineYLevel")
    public final C_extends<Integer> rx;
    @C_implements(id_class="replantNetherWart")
    public final C_extends<Boolean> rd;
    @C_implements(id_class="renderPathIgnoreDepth")
    public final C_extends<Boolean> rk;
    @C_implements(id_class="yLevelBoxSize")
    public final C_extends<Double> rW;
    @C_implements(id_class="rightClickContainerOnArrival")
    public final C_extends<Boolean> rz;
    @C_implements(id_class="goalRenderLineWidthPixels")
    public final C_extends<Float> rQ;
    @C_implements(id_class="assumeStep")
    public final C_extends<Boolean> rN;
    @C_implements(id_class="colorInvertedGoalBox")
    public final C_extends<Color> rc;
    @C_implements(id_class="costVerificationLookahead")
    public final C_extends<Integer> ru;
    @C_implements(id_class="backtrackCostFavoringCoefficient")
    public final C_extends<Double> rm;
    @C_implements(id_class="assumeWalkOnWater")
    public final C_extends<Boolean> rZ;
    @C_implements(id_class="incorrectSize")
    public final C_extends<Integer> rv;
    @C_implements(id_class="internalMiningAirException")
    public final C_extends<Boolean> rF;
    @C_implements(id_class="planAheadFailureTimeoutMS")
    public final C_extends<Long> rL;
    @C_implements(id_class="allowDiagonalAscend")
    public final C_extends<Boolean> rA;
    @C_implements(id_class="fadePath")
    public final C_extends<Boolean> rn;
    @C_implements(id_class="forceInternalMining")
    public final C_extends<Boolean> rC;
    @C_implements(id_class="layerOrder")
    public final C_extends<Boolean> rl;
    @C_implements(id_class="distanceTrim")
    public final C_extends<Boolean> rH;
    @C_implements(id_class="considerPotionEffects")
    public final C_extends<Boolean> ry;
    @C_implements(id_class="censorRanCommands")
    public final C_extends<Boolean> rp;
    @C_implements(id_class="okIfAir")
    public final C_extends<List<xd_3>> rq;
    @C_implements(id_class="slowPathTimeDelayMS")
    public final C_extends<Long> rT;
    @C_implements(id_class="echoCommands")
    public final C_extends<Boolean> rt;
    @C_implements(id_class="chunkPackerQueueMaxSize")
    public final C_extends<Integer> rw;
    @C_implements(id_class="allowBreak")
    public final C_extends<Boolean> rI;
    @C_implements(id_class="colorCurrentPath")
    public final C_extends<Color> rf;
    @C_implements(id_class="assumeWalkOnLava")
    public final C_extends<Boolean> rj;
    @C_implements(id_class="colorBlocksToBreak")
    public final C_extends<Color> rV;
    private static long[] BM;
    @C_implements(id_class="buildValidSubstitutes")
    public final C_extends<Map<xd_3, List<xd_3>>> rg;
    @C_implements(id_class="exploreChunkSetMinimumSize")
    public final C_extends<Integer> rR;
    @C_implements(id_class="strictLiquidCheck")
    public final C_extends<Boolean> rY;
    @C_implements(id_class="logAsToast")
    public final C_extends<Boolean> ro;
    @C_implements(id_class="notificationOnPathComplete")
    public final C_extends<Boolean> rK;
    @C_implements(id_class="colorBlocksToPlace")
    public final C_extends<Color> rD;
    @C_implements(id_class="pathThroughCachedOnly")
    public final C_extends<Boolean> rU;
    @C_implements(id_class="pathingMapDefaultSize")
    public final C_extends<Integer> re;
    @C_implements(id_class="pathCutoffMinimumLength")
    public final C_extends<Integer> ra;
    @C_implements(id_class="colorBestPathSoFar")
    public final C_extends<Color> ri;
    @C_implements(id_class="assumeSafeWalk")
    public final C_extends<Boolean> Pr;
    @C_implements(id_class="toastTimer")
    public final C_extends<Long> PP;
    @C_implements(id_class="allowOnlyExposedOresDistance")
    public final C_extends<Integer> PB;
    @C_implements(id_class="costHeuristic")
    public final C_extends<Double> PS;
    @C_implements(id_class="renderGoal")
    public final C_extends<Boolean> Ps;
    @C_implements(id_class="followOffsetDirection")
    public final C_extends<Float> PE;
    @C_implements(id_class="replantCrops")
    public final C_extends<Boolean> PG;
    @C_implements(id_class="cancelOnGoalInvalidation")
    public final C_extends<Boolean> Pb;
    @C_implements(id_class="notificationOnBuildFinished")
    public final C_extends<Boolean> PM;
    private static double[] BO;
    @C_implements(id_class="rightClickSpeed")
    public final C_extends<Integer> PO;
    @C_implements(id_class="blacklistClosestOnFailure")
    public final C_extends<Boolean> Ph;
    @C_implements(id_class="acceptableThrowawayItems")
    public final C_extends<List<rdb_3>> PX;
    @C_implements(id_class="renderGoalIgnoreDepth")
    public final C_extends<Boolean> PJ;
    @C_implements(id_class="colorBlocksToWalkInto")
    public final C_extends<Color> Px;
    @C_implements(id_class="doBedWaypoints")
    public final C_extends<Boolean> Pd;
    @C_implements(id_class="maxPathHistoryLength")
    public final C_extends<Integer> Pk;
    @C_implements(id_class="allowWalkOnBottomSlab")
    public final C_extends<Boolean> PW;
    @C_implements(id_class="jumpPenalty")
    public final C_extends<Double> Pz;
    @C_implements(id_class="startAtLayer")
    public final C_extends<Integer> PQ;
    @C_implements(id_class="disableCompletionCheck")
    public final C_extends<Boolean> PN;
    @C_implements(id_class="allowSprint")
    public final C_extends<Boolean> Pc;
    @C_implements(id_class="notifier")
    public final C_extends<BiConsumer<String, Boolean>> Pu;
    @C_implements(id_class="worldExploringChunkOffset")
    public final C_extends<Integer> Pm;
    @C_implements(id_class="schematicFallbackExtension")
    public final C_extends<String> PZ;
    @C_implements(id_class="renderGoalAnimated")
    public final C_extends<Boolean> Pv;
    @C_implements(id_class="ticksBetweenInventoryMoves")
    public final C_extends<Integer> PF;
    @C_implements(id_class="pauseMiningForFallingBlocks")
    public final C_extends<Boolean> PL;
    @C_implements(id_class="notificationOnMineFail")
    public final C_extends<Boolean> PA;
    @C_implements(id_class="builderTickScanRadius")
    public final C_extends<Integer> Pn;
    @C_implements(id_class="minimumImprovementRepropagation")
    public final C_extends<Boolean> PC;
    @C_implements(id_class="blocksToDisallowBreaking")
    public final C_extends<List<xd_3>> Pl;
    @C_implements(id_class="failureTimeoutMS")
    public final C_extends<Long> PH;
    @C_implements(id_class="buildIgnoreProperties")
    public final C_extends<List<String>> Py;
    @C_implements(id_class="chatDebug")
    public final C_extends<Boolean> Pp;
    @C_implements(id_class="okIfWater")
    public final C_extends<Boolean> Pq;
    @C_implements(id_class="selectionLineWidth")
    public final C_extends<Float> PT;
    @C_implements(id_class="schematicOrientationY")
    public final C_extends<Boolean> Pt;
    @C_implements(id_class="renderSelectionCorners")
    public final C_extends<Boolean> Pw;
    @C_implements(id_class="splicePath")
    public final C_extends<Boolean> PI;
    @C_implements(id_class="mineGoalUpdateInterval")
    public final C_extends<Integer> Pf;
    public Object[] Pj;
    @C_implements(id_class="mineScanDroppedItems")
    public final C_extends<Boolean> PV;
    @C_implements(id_class="blockBreakSpeed")
    public final C_extends<Integer> Pg;
    @C_implements(id_class="allowDownward")
    public final C_extends<Boolean> PR;
    @C_implements(id_class="sprintAscends")
    public final C_extends<Boolean> PY;
    @C_implements(id_class="colorGoalBox")
    public final C_extends<Color> Po;
    @C_implements(id_class="buildIgnoreExisting")
    public final C_extends<Boolean> PK;
    @C_implements(id_class="blocksToAvoid")
    public final C_extends<List<xd_3>> PD;
    @C_implements(id_class="extendCacheOnThreshold")
    public final C_extends<Boolean> PU;
    @C_implements(id_class="blockPlacementPenalty")
    public final C_extends<Double> Pe;
    @C_implements(id_class="allowParkourPlace")
    public final C_extends<Boolean> Pa;
    @C_implements(id_class="buildOnlySelection")
    public final C_extends<Boolean> Pi;
    @C_implements(id_class="itemSaver")
    public final C_extends<Boolean> Br;
    @C_implements(id_class="mobSpawnerAvoidanceRadius")
    public final C_extends<Integer> BP;
    private static short[] Bh;
    @C_implements(id_class="buildRepeat")
    public final C_extends<rja_3> BB;
    @C_implements(id_class="cachedChunksOpacity")
    public final C_extends<Float> BS;
    private static String[] BX;
    @C_implements(id_class="mapArtMode")
    public final C_extends<Boolean> Bs;

    public boolean id_byte() {
        C_class c_class = C_throws.id_byte();
        return (Boolean)this.k.id_class[Bh[13]] != false && !c_class.id_volatile().id_byte() && !c_class.id_break().id_byte() ? BG[135] : BG[136];
    }

    public C_private() {
        Map map;
        List list;
        Map map2;
        this.id_catch();
        this.rI = new C_extends(this, BG[0]);
        this.I = new C_extends(this, new ArrayList());
        this.Pc = new C_extends(this, BG[1]);
        this.k = new C_extends(this, BG[2]);
        this.z = new C_extends(this, BG[3]);
        this.PF = new C_extends(this, BG[4]);
        this.id_class = new C_extends(this, BG[5]);
        this.rr = new C_extends(this, BG[6]);
        this.id_goto = new C_extends(this, BG[7]);
        this.Pe = new C_extends(this, BO[0]);
        this.rs = new C_extends(this, BO[1]);
        this.Pz = new C_extends(this, BO[2]);
        this.id_int = new C_extends(this, BO[3]);
        this.rY = new C_extends(this, BG[8]);
        this.rJ = new C_extends(this, BG[9]);
        this.rZ = new C_extends(this, BG[10]);
        this.rj = new C_extends(this, BG[11]);
        this.rN = new C_extends(this, BG[12]);
        this.Pr = new C_extends(this, BG[13]);
        this.o = new C_extends(this, BG[14]);
        this.id_else = new C_extends(this, BG[15]);
        this.Y = new C_extends(this, BG[16]);
        this.rA = new C_extends(this, BG[17]);
        this.PR = new C_extends(this, BG[18]);
        rdb_3[] rdb_3Array = new rdb_3[Bb[0]];
        rdb_3Array[C_private.BG[19]] = xu_3.id_finally.id_case();
        rdb_3Array[C_private.BG[20]] = xu_3.id_volatile.id_case();
        rdb_3Array[C_private.Bb[1]] = xu_3.PR.id_case();
        rdb_3Array[C_private.Bb[2]] = xu_3.id_break.id_case();
        this.PX = new C_extends(this, new ArrayList<rdb_3>(Arrays.asList(rdb_3Array)));
        this.PD = new C_extends(this, new ArrayList());
        this.Pl = new C_extends(this, new ArrayList());
        xd_3[] xd_3Array = new xd_3[Bb[3]];
        xd_3Array[C_private.BG[21]] = xu_3.PP;
        xd_3Array[C_private.BG[22]] = xu_3.Ps;
        xd_3Array[C_private.Bb[4]] = xu_3.re;
        xd_3Array[C_private.Bb[5]] = xu_3.sZ;
        this.p = new C_extends(this, new ArrayList<xd_3>(Arrays.asList(xd_3Array)));
        this.rG = new C_extends(this, BO[4]);
        this.rO = new C_extends(this, new ArrayList<xd_3>(Arrays.asList(new xd_3[BG[23]])));
        this.S = new C_extends(this, new ArrayList<xd_3>(Arrays.asList(new xd_3[BG[24]])));
        this.rg = new C_extends(this, new HashMap());
        this.U = new C_extends(this, new HashMap());
        this.rq = new C_extends(this, new ArrayList<xd_3>(Arrays.asList(new xd_3[BG[25]])));
        this.PK = new C_extends(this, BG[26]);
        this.id_volatile = new C_extends(this, BG[27]);
        this.Py = new C_extends(this, new ArrayList<String>(Arrays.asList(new String[BG[28]])));
        this.id_continue = new C_extends(this, BG[29]);
        this.id_public = new C_extends(this, BG[30]);
        this.PW = new C_extends(this, BG[31]);
        this.id_double = new C_extends(this, BG[32]);
        this.Pa = new C_extends(this, BG[33]);
        this.ry = new C_extends(this, BG[34]);
        this.PY = new C_extends(this, BG[35]);
        this.id_switch = new C_extends(this, BG[36]);
        this.PL = new C_extends(this, BG[37]);
        this.PO = new C_extends(this, Bb[6]);
        this.id_boolean = new C_extends(this, Float.valueOf(BE[0]));
        this.Pg = new C_extends(this, Bb[7]);
        this.t = new C_extends(this, BO[5]);
        this.PS = new C_extends(this, BO[6]);
        this.s = new C_extends(this, Bb[8]);
        this.rm = new C_extends(this, BO[7]);
        this.id_transient = new C_extends(this, BG[38]);
        this.D = new C_extends(this, BO[8]);
        this.BP = new C_extends(this, Bb[9]);
        this.id_this = new C_extends(this, BO[9]);
        this.id_long = new C_extends(this, Bb[10]);
        this.rz = new C_extends(this, BG[39]);
        this.P = new C_extends(this, BG[40]);
        this.PC = new C_extends(this, BG[41]);
        this.id_return = new C_extends(this, BG[42]);
        this.u = new C_extends(this, BO[10]);
        this.ru = new C_extends(this, Bb[11]);
        this.id_final = new C_extends(this, BO[11]);
        this.ra = new C_extends(this, Bb[12]);
        this.H = new C_extends(this, Bh[0]);
        this.re = new C_extends(this, Bh[1]);
        this.a = new C_extends(this, Float.valueOf(BE[1]));
        this.rb = new C_extends(this, Bb[13]);
        this.id_extends = new C_extends(this, Bb[14]);
        this.C = new C_extends(this, BG[43]);
        this.r = new C_extends(this, BG[44]);
        this.M = new C_extends(this, BG[45]);
        this.id_default = new C_extends(this, Bb[15]);
        this.rh = new C_extends(this, BM[0]);
        this.PH = new C_extends(this, BM[1]);
        this.w = new C_extends(this, BM[2]);
        this.rL = new C_extends(this, BM[3]);
        this.id_synchronized = new C_extends(this, BG[46]);
        this.rT = new C_extends(this, BM[4]);
        this.j = new C_extends(this, BM[5]);
        this.Pd = new C_extends(this, BG[47]);
        this.y = new C_extends(this, BG[48]);
        this.id_throw = new C_extends(this, BG[49]);
        this.id_throws = new C_extends(this, BG[50]);
        this.rw = new C_extends(this, Bh[2]);
        this.B = new C_extends(this, BG[51]);
        this.ro = new C_extends(this, BG[52]);
        this.PP = new C_extends(this, BM[6]);
        this.Pp = new C_extends(this, BG[53]);
        this.rB = new C_extends(this, BG[54]);
        this.Q = new C_extends(this, BG[55]);
        this.x = new C_extends(this, BG[56]);
        this.E = new C_extends(this, BG[57]);
        this.Ps = new C_extends(this, BG[58]);
        this.Pv = new C_extends(this, BG[59]);
        this.g = new C_extends(this, BG[60]);
        this.PJ = new C_extends(this, BG[61]);
        this.id_const = new C_extends(this, BG[62]);
        this.rE = new C_extends(this, BG[63]);
        this.rk = new C_extends(this, BG[64]);
        this.id_break = new C_extends(this, Float.valueOf(BE[2]));
        this.rQ = new C_extends(this, Float.valueOf(BE[3]));
        this.rn = new C_extends(this, BG[65]);
        this.n = new C_extends(this, BG[66]);
        this.id_private = new C_extends(this, BG[67]);
        this.N = new C_extends(this, BG[68]);
        this.F = new C_extends(this, BG[69]);
        this.rU = new C_extends(this, BG[70]);
        this.id_finally = new C_extends(this, BG[71]);
        this.Ph = new C_extends(this, BG[72]);
        this.e = new C_extends(this, BG[73]);
        this.BS = new C_extends(this, Float.valueOf(BE[4]));
        this.l = new C_extends(this, BG[74]);
        this.id_protected = new C_extends(this, BX[0]);
        this.id_native = new C_extends(this, BG[75]);
        this.rt = new C_extends(this, BG[76]);
        this.A = new C_extends(this, BG[77]);
        this.rp = new C_extends(this, BG[78]);
        this.Br = new C_extends(this, BG[79]);
        this.V = new C_extends(this, Bb[16]);
        this.G = new C_extends(this, BG[80]);
        this.d = new C_extends(this, BG[81]);
        this.PI = new C_extends(this, BG[82]);
        this.Pk = new C_extends(this, Bh[3]);
        this.id_void = new C_extends(this, Bb[17]);
        this.Pf = new C_extends(this, Bb[18]);
        this.c = new C_extends(this, Bb[19]);
        this.id_import = new C_extends(this, BG[83]);
        this.rM = new C_extends(this, Bh[4]);
        this.Z = new C_extends(this, BG[84]);
        this.PB = new C_extends(this, BG[85]);
        this.b = new C_extends(this, BG[86]);
        this.Pm = new C_extends(this, BG[87]);
        this.rR = new C_extends(this, Bb[20]);
        this.rP = new C_extends(this, Bb[21]);
        this.PG = new C_extends(this, BG[88]);
        this.rd = new C_extends(this, BG[89]);
        this.f = new C_extends(this, Bh[5]);
        this.PU = new C_extends(this, BG[90]);
        this.O = new C_extends(this, BG[91]);
        this.rl = new C_extends(this, BG[92]);
        this.id_new = new C_extends(this, BG[93]);
        this.PQ = new C_extends(this, BG[94]);
        this.X = new C_extends(this, BG[95]);
        this.Pi = new C_extends(this, BG[96]);
        this.BB = new C_extends(this, new rja_3(BG[97], BG[98], BG[99]));
        this.id_case = new C_extends(this, Bb[22]);
        this.id_static = new C_extends(this, BG[100]);
        this.id_for = new C_extends(this, BG[101]);
        this.K = new C_extends(this, BG[102]);
        this.Bs = new C_extends(this, BG[103]);
        this.Pq = new C_extends(this, BG[104]);
        this.rv = new C_extends(this, Bb[23]);
        this.h = new C_extends(this, BO[12]);
        this.id_byte = new C_extends(this, BO[13]);
        this.W = new C_extends(this, BG[105]);
        this.Pt = new C_extends(this, BG[106]);
        this.v = new C_extends(this, BG[107]);
        this.PZ = new C_extends(this, BX[1]);
        this.Pn = new C_extends(this, Bb[24]);
        this.PV = new C_extends(this, BG[108]);
        this.q = new C_extends(this, BM[7]);
        this.rH = new C_extends(this, BG[109]);
        this.Pb = new C_extends(this, BG[110]);
        this.id_instanceof = new C_extends(this, Bb[25]);
        this.id_char = new C_extends(this, BG[111]);
        this.id_catch = new C_extends(this, BG[112]);
        this.rx = new C_extends(this, Bb[26]);
        this.i = new C_extends(this, BG[113]);
        this.rC = new C_extends(this, BG[114]);
        this.rF = new C_extends(this, BG[115]);
        this.id_while = new C_extends(this, BO[14]);
        this.PE = new C_extends(this, Float.valueOf(BE[5]));
        this.T = new C_extends(this, Bb[27]);
        this.id_interface = new C_extends(this, BG[116]);
        this.PN = new C_extends(this, BG[117]);
        this.id_strictfp = new C_extends(this, BM[8]);
        this.id_implements = new C_extends(this, rVe_12 -> ((cq_3)QY.id_instanceof().id_class[Bh[16]]).id_throws().id_class((rgP_2)rVe_12));
        this.Pu = new C_extends(this, Pb_1::id_class);
        this.rW = new C_extends(this, BO[15]);
        this.rf = new C_extends(this, Color.RED);
        this.L = new C_extends(this, Color.MAGENTA);
        this.rV = new C_extends(this, Color.RED);
        this.rD = new C_extends(this, Color.GREEN);
        this.Px = new C_extends(this, Color.MAGENTA);
        this.ri = new C_extends(this, Color.BLUE);
        this.R = new C_extends(this, Color.CYAN);
        this.Po = new C_extends(this, Color.GREEN);
        this.rc = new C_extends(this, Color.RED);
        this.id_try = new C_extends(this, Color.CYAN);
        this.id_short = new C_extends(this, Color.BLACK);
        this.id_float = new C_extends(this, Color.ORANGE);
        this.id_super = new C_extends(this, Float.valueOf(BE[6]));
        this.PT = new C_extends(this, Float.valueOf(BE[7]));
        this.J = new C_extends(this, BG[118]);
        this.id_package = new C_extends(this, BG[119]);
        this.Pw = new C_extends(this, BG[120]);
        this.rS = new C_extends(this, BG[121]);
        this.rX = new C_extends(this, BG[122]);
        this.rK = new C_extends(this, BG[123]);
        this.m = new C_extends(this, BG[124]);
        this.PM = new C_extends(this, BG[125]);
        this.id_abstract = new C_extends(this, BG[126]);
        this.PA = new C_extends(this, BG[127]);
        Field[] fieldArray = this.getClass().getFields();
        HashMap<String, C_extends> hashMap = new HashMap<String, C_extends>();
        ArrayList<C_extends> arrayList = new ArrayList<C_extends>();
        HashMap<C_extends, Type> hashMap2 = new HashMap<C_extends, Type>();
        try {
            Field[] fieldArray2 = fieldArray;
            int n = fieldArray2.length;
            for (int i = BG[128]; i < n; ++i) {
                String string;
                Field field = fieldArray2[i];
                if (!field.getType().equals(C_extends.class)) continue;
                if (!field.isAnnotationPresent(C_implements.class)) {
                    throw new IllegalStateException(BX[2]);
                }
                C_extends c_extends = (C_extends)field.get(this);
                String string2 = string = field.getAnnotation(C_implements.class).id_class();
                c_extends.id_class[C_private.Bh[6]] = string2;
                if (hashMap.containsKey(string = string.toLowerCase())) {
                    throw new IllegalStateException(BX[3]);
                }
                hashMap.put(string, c_extends);
                arrayList.add(c_extends);
                hashMap2.put(c_extends, ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[BG[129]]);
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalStateException(illegalAccessException);
        }
        this.Pj[C_private.Bh[7]] = map2 = Collections.unmodifiableMap(hashMap);
        this.Pj[C_private.Bh[8]] = list = Collections.unmodifiableList(arrayList);
        this.Pj[C_private.Bh[9]] = map = Collections.unmodifiableMap(hashMap2);
    }

    static {
        C_private.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE27EB7E3EF4367F5L;
    }

    public <T> List<C_extends<T>> id_class(Class<T> clazz) {
        ArrayList<C_extends<T>> arrayList = new ArrayList<C_extends<T>>();
        for (C_extends c_extends : (List)this.Pj[Bh[10]]) {
            if (!c_extends.id_byte().equals(clazz)) continue;
            arrayList.add(c_extends);
        }
        return arrayList;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{61, -119, -117, -59, 6, 83, -80, -10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class() {
        C_class c_class = C_throws.id_byte();
        return (Boolean)this.Pa.id_class[Bh[11]] != false && !c_class.id_break().id_byte() ? BG[130] : BG[131];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x36E30BB8;
    }

    public boolean id_break() {
        C_class c_class = C_throws.id_byte();
        return (Boolean)this.PW.id_class[Bh[14]] != false && !c_class.id_break().id_byte() ? BG[137] : BG[138];
    }

    public boolean id_throws() {
        C_class c_class = C_throws.id_byte();
        if (c_class.id_volatile().id_byte() || c_class.id_abstract().id_byte()) {
            return BG[132];
        }
        return (Boolean)this.rI.id_class[Bh[12]] != false && !c_class.id_break().id_byte() ? BG[133] : BG[134];
    }

    private static /* synthetic */ void ntfClinit() {
        C_private.id_finally();
        C_private.id_private();
        C_private.id_final();
        C_private.id_native();
        C_private.id_extends();
        C_private.id_volatile();
        C_private.id_implements();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[143];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[15] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[34] = true;
        blArray[35] = true;
        blArray[36] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[40] = true;
        blArray[41] = true;
        blArray[43] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[50] = true;
        blArray[54] = true;
        blArray[56] = true;
        blArray[58] = true;
        blArray[59] = true;
        blArray[60] = true;
        blArray[61] = true;
        blArray[63] = true;
        blArray[64] = true;
        blArray[65] = true;
        blArray[66] = true;
        blArray[67] = true;
        blArray[68] = true;
        blArray[69] = true;
        blArray[71] = true;
        blArray[72] = true;
        blArray[74] = true;
        blArray[79] = true;
        blArray[81] = true;
        blArray[82] = true;
        blArray[85] = true;
        blArray[86] = true;
        blArray[88] = true;
        blArray[93] = true;
        blArray[100] = true;
        blArray[108] = true;
        blArray[109] = true;
        blArray[110] = true;
        blArray[114] = true;
        blArray[115] = true;
        blArray[118] = true;
        blArray[119] = true;
        blArray[120] = true;
        blArray[121] = true;
        blArray[123] = true;
        blArray[124] = true;
        blArray[125] = true;
        blArray[126] = true;
        blArray[127] = true;
        blArray[130] = true;
        blArray[132] = true;
        blArray[133] = true;
        blArray[135] = true;
        blArray[137] = true;
        blArray[139] = true;
        blArray[141] = true;
        BG = blArray;
    }

    private void id_catch() {
        if (this.Pj == null) {
            Object[] objectArray = this.Pj = new Object[Bb[28]];
        }
    }

    private static void id_extends() {
        float[] fArray = new float[8];
        fArray[0] = 4.5f;
        fArray[1] = 0.75f;
        fArray[2] = 2.0f;
        fArray[3] = 2.0f;
        fArray[4] = 0.5f;
        fArray[6] = 0.5f;
        fArray[7] = 2.0f;
        BE = fArray;
    }

    public boolean id_case() {
        C_class c_class = C_throws.id_byte();
        return !c_class.id_break().id_byte() ? BG[141] : BG[142];
    }

    private static void id_implements() {
        Bb = new byte[]{4, 2, 3, 4, 2, 3, 4, 6, 50, 16, 8, 5, 30, 3, 20, 100, 10, 50, 5, 10, 10, 64, -1, 100, 5, 120, 11, 3, 3};
    }

    public boolean id_protected() {
        C_class c_class = C_throws.id_byte();
        return (Boolean)this.id_goto.id_class[Bh[15]] != false && !c_class.id_break().id_byte() ? BG[139] : BG[140];
    }

    private static void id_private() {
        BX = new String[]{new String("."), new String("schematic"), new String("Setting field missing SettingName annotation"), new String("Duplicate setting name")};
    }

    private static void id_final() {
        BM = new long[]{500L, 2000L, 4000L, 5000L, 100L, 40000L, 5000L, 250L, -1L};
    }

    private static void id_volatile() {
        short[] sArray = new short[17];
        sArray[0] = 150;
        sArray[1] = 1024;
        sArray[2] = 2000;
        sArray[3] = 300;
        sArray[4] = 255;
        sArray[5] = 256;
        sArray[6] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[16] = 19;
        Bh = sArray;
    }

    private static void id_native() {
        double[] dArray = new double[16];
        dArray[0] = 20.0;
        dArray[1] = 2.0;
        dArray[2] = 2.0;
        dArray[3] = 3.0;
        dArray[4] = 0.1;
        dArray[5] = 0.2;
        dArray[6] = 3.563;
        dArray[7] = 0.5;
        dArray[8] = 2.0;
        dArray[9] = 1.5;
        dArray[10] = 10.0;
        dArray[11] = 0.9;
        dArray[12] = 10.0;
        dArray[13] = 2.0;
        dArray[15] = 15.0;
        BO = dArray;
    }
}

