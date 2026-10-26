package celestial;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.StandardCharsets;
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
   @C_implements(
      id_class = "inventoryMoveOnlyIfStationary"
   )
   public final C_extends<Boolean> class_;
   @C_implements(
      id_class = "pathRenderLineWidthPixels"
   )
   public final C_extends<Float> break_;
   @C_implements(
      id_class = "placeIncorrectBlockPenaltyMultiplier"
   )
   public final C_extends<Double> byte_;
   @C_finally(
      id_class = "baritone.changecommandsprefix.title",
      id_break = "baritone.changecommandsprefix.message"
   )
   @C_implements(
      id_class = "prefix"
   )
   public final C_extends<String> protected_;
   @C_implements(
      id_class = "pruneRegionsFromRAM"
   )
   public final C_extends<Boolean> throws_;
   @C_implements(
      id_class = "buildRepeatCount"
   )
   public final C_extends<Integer> case_;
   @C_implements(
      id_class = "legitMine"
   )
   public final C_extends<Boolean> catch_;
   @C_implements(
      id_class = "blockFreeLook"
   )
   public final C_extends<Boolean> private_;
   @C_implements(
      id_class = "logger"
   )
   public final C_extends<Consumer<rVe_1>> implements_;
   @C_implements(
      id_class = "sprintInWater"
   )
   public final C_extends<Boolean> finally_;
   @C_implements(
      id_class = "maxFallHeightBucket"
   )
   public final C_extends<Integer> extends_;
   @C_implements(
      id_class = "shortBaritonePrefix"
   )
   public final C_extends<Boolean> native_;
   @C_implements(
      id_class = "buildIgnoreDirection"
   )
   public final C_extends<Boolean> volatile_;
   @C_implements(
      id_class = "pathCutoffFactor"
   )
   public final C_extends<Double> final_;
   @C_implements(
      id_class = "renderSelectionIgnoreDepth"
   )
   public final C_extends<Boolean> package_;
   @C_implements(
      id_class = "walkOnWaterOnePenalty"
   )
   public final C_extends<Double> int_;
   @C_implements(
      id_class = "layerHeight"
   )
   public final C_extends<Integer> new_;
   @C_implements(
      id_class = "avoidUpdatingFallingBlocks"
   )
   public final C_extends<Boolean> continue_;
   @C_implements(
      id_class = "selectionOpacity"
   )
   public final C_extends<Float> super_;
   private static float[] BE;
   @C_implements(
      id_class = "mobAvoidanceCoefficient"
   )
   public final C_extends<Double> this_;
   @C_implements(
      id_class = "allowParkourAscend"
   )
   public final C_extends<Boolean> else_;
   @C_implements(
      id_class = "slowPath"
   )
   public final C_extends<Boolean> synchronized_;
   private static boolean[] BG;
   @C_implements(
      id_class = "cutoffAtLoadBoundary"
   )
   public final C_extends<Boolean> return_;
   @C_implements(
      id_class = "allowVines"
   )
   public final C_extends<Boolean> public_;
   @C_implements(
      id_class = "autoTool"
   )
   public final C_extends<Boolean> goto_;
   @C_implements(
      id_class = "followOffsetDistance"
   )
   public final C_extends<Double> while_;
   @C_implements(
      id_class = "colorSelection"
   )
   public final C_extends<Color> try_;
   @C_implements(
      id_class = "axisHeight"
   )
   public final C_extends<Integer> instanceof_;
   @C_implements(
      id_class = "chunkCaching"
   )
   public final C_extends<Boolean> throw_;
   @C_implements(
      id_class = "followTargetMaxDistance"
   )
   public final C_extends<Integer> interface_;
   @C_implements(
      id_class = "disconnectOnArrival"
   )
   public final C_extends<Boolean> char_;
   @C_implements(
      id_class = "notificationOnExploreFinished"
   )
   public final C_extends<Boolean> abstract_;
   @C_implements(
      id_class = "mobAvoidanceRadius"
   )
   public final C_extends<Integer> long_;
   @C_implements(
      id_class = "colorSelectionPos2"
   )
   public final C_extends<Color> float_;
   @C_implements(
      id_class = "pathHistoryCutoffAmount"
   )
   public final C_extends<Integer> void_;
   @C_implements(
      id_class = "buildRepeatSneaky"
   )
   public final C_extends<Boolean> static_;
   @C_implements(
      id_class = "minYLevelWhileMining"
   )
   public final C_extends<Integer> import_;
   @C_implements(
      id_class = "colorSelectionPos1"
   )
   public final C_extends<Color> short_;
   @C_implements(
      id_class = "movementTimeoutTicks"
   )
   public final C_extends<Integer> default_;
   @C_implements(
      id_class = "renderGoalXZBeacon"
   )
   public final C_extends<Boolean> const_;
   @C_implements(
      id_class = "cachedChunksExpirySeconds"
   )
   public final C_extends<Long> strictfp_;
   @C_implements(
      id_class = "blockReachDistance"
   )
   public final C_extends<Float> boolean_;
   @C_implements(
      id_class = "avoidance"
   )
   public final C_extends<Boolean> transient_;
   @C_implements(
      id_class = "breakFromAbove"
   )
   public final C_extends<Boolean> for_;
   @C_implements(
      id_class = "allowParkour"
   )
   public final C_extends<Boolean> double_;
   @C_implements(
      id_class = "overshootTraverse"
   )
   public final C_extends<Boolean> switch_;
   @C_implements(
      id_class = "simplifyUnloadedYCoord"
   )
   public final C_extends<Boolean> r;
   @C_implements(
      id_class = "enterPortal"
   )
   public final C_extends<Boolean> P;
   @C_implements(
      id_class = "backfill"
   )
   public final C_extends<Boolean> B;
   @C_implements(
      id_class = "buildSkipBlocks"
   )
   public final C_extends<List<xd_3>> S;
   @C_implements(
      id_class = "pathingMaxChunkBorderFetch"
   )
   public final C_extends<Integer> s;
   @C_implements(
      id_class = "renderPathAsLine"
   )
   public final C_extends<Boolean> E;
   @C_implements(
      id_class = "preferSilkTouch"
   )
   public final C_extends<Boolean> G;
   @C_implements(
      id_class = "exploreForBlocks"
   )
   public final C_extends<Boolean> b;
   @C_implements(
      id_class = "repackOnAnyBlockChange"
   )
   public final C_extends<Boolean> M;
   @C_implements(
      id_class = "buildInLayers"
   )
   public final C_extends<Boolean> O;
   @C_implements(
      id_class = "breakCorrectBlockPenaltyMultiplier"
   )
   public final C_extends<Double> h;
   @C_implements(
      id_class = "skipFailedLayers"
   )
   public final C_extends<Boolean> X;
   @C_implements(
      id_class = "renderSelection"
   )
   public final C_extends<Boolean> J;
   @C_implements(
      id_class = "renderPath"
   )
   public final C_extends<Boolean> x;
   @C_implements(
      id_class = "walkWhileBreaking"
   )
   public final C_extends<Boolean> d;
   @C_implements(
      id_class = "allowPlace"
   )
   public final C_extends<Boolean> k;
   @C_implements(
      id_class = "schematicOrientationX"
   )
   public final C_extends<Boolean> W;
   @C_implements(
      id_class = "allowInventory"
   )
   public final C_extends<Boolean> z;
   @C_implements(
      id_class = "chatControlAnyway"
   )
   public final C_extends<Boolean> Q;
   @C_implements(
      id_class = "remainWithExistingLookDirection"
   )
   public final C_extends<Boolean> N;
   @C_implements(
      id_class = "maxCachedWorldScanCount"
   )
   public final C_extends<Integer> c;
   @C_implements(
      id_class = "maxCostIncrease"
   )
   public final C_extends<Double> u;
   @C_implements(
      id_class = "notificationOnFarmFail"
   )
   public final C_extends<Boolean> m;
   @C_implements(
      id_class = "allowOnlyExposedOres"
   )
   public final C_extends<Boolean> Z;
   @C_implements(
      id_class = "schematicOrientationZ"
   )
   public final C_extends<Boolean> v;
   @C_implements(
      id_class = "antiCheatCompatibility"
   )
   public final C_extends<Boolean> F;
   @C_implements(
      id_class = "colorNextPath"
   )
   public final C_extends<Color> L;
   @C_implements(
      id_class = "censorCoordinates"
   )
   public final C_extends<Boolean> A;
   @C_implements(
      id_class = "freeLook"
   )
   public final C_extends<Boolean> n;
   @C_implements(
      id_class = "allowOvershootDiagonalDescend"
   )
   public final C_extends<Boolean> C;
   @C_implements(
      id_class = "prefixControl"
   )
   public final C_extends<Boolean> l;
   @C_implements(
      id_class = "planningTickLookahead"
   )
   public final C_extends<Integer> H;
   @C_implements(
      id_class = "doDeathWaypoints"
   )
   public final C_extends<Boolean> y;
   @C_implements(
      id_class = "blocksToAvoidBreaking"
   )
   public final C_extends<List<xd_3>> p;
   @C_implements(
      id_class = "mineDropLoiterDurationMSThanksLouca"
   )
   public final C_extends<Long> q;
   @C_implements(
      id_class = "followRadius"
   )
   public final C_extends<Integer> T;
   @C_implements(
      id_class = "randomLooking"
   )
   public final C_extends<Double> t;
   @C_implements(
      id_class = "planAheadPrimaryTimeoutMS"
   )
   public final C_extends<Long> w;
   @C_implements(
      id_class = "allowBreakAnyway"
   )
   public final C_extends<List<xd_3>> I;
   @C_implements(
      id_class = "farmMaxScanSize"
   )
   public final C_extends<Integer> f;
   @C_implements(
      id_class = "slowPathTimeoutMS"
   )
   public final C_extends<Long> j;
   @C_implements(
      id_class = "itemSaverThreshold"
   )
   public final C_extends<Integer> V;
   @C_implements(
      id_class = "renderSelectionBoxes"
   )
   public final C_extends<Boolean> g;
   @C_implements(
      id_class = "colorMostRecentConsidered"
   )
   public final C_extends<Color> R;
   @C_implements(
      id_class = "allowDiagonalDescend"
   )
   public final C_extends<Boolean> Y;
   private static byte[] Bb;
   @C_implements(
      id_class = "allowJumpAt256"
   )
   public final C_extends<Boolean> o;
   @C_implements(
      id_class = "goalBreakFromAbove"
   )
   public final C_extends<Boolean> K;
   @C_implements(
      id_class = "mobSpawnerAvoidanceCoefficient"
   )
   public final C_extends<Double> D;
   @C_implements(
      id_class = "buildSubstitutes"
   )
   public final C_extends<Map<xd_3, List<xd_3>>> U;
   @C_implements(
      id_class = "renderCachedChunks"
   )
   public final C_extends<Boolean> e;
   @C_implements(
      id_class = "pathingMapLoadFactor"
   )
   public final C_extends<Float> a;
   @C_implements(
      id_class = "legitMineIncludeDiagonals"
   )
   public final C_extends<Boolean> i;
   @C_implements(
      id_class = "assumeExternalAutoTool"
   )
   public final C_extends<Boolean> rr;
   @C_implements(
      id_class = "exploreMaintainY"
   )
   public final C_extends<Integer> rP;
   @C_implements(
      id_class = "chatControl"
   )
   public final C_extends<Boolean> rB;
   @C_implements(
      id_class = "useSwordToMine"
   )
   public final C_extends<Boolean> rS;
   @C_implements(
      id_class = "blockBreakAdditionalPenalty"
   )
   public final C_extends<Double> rs;
   @C_implements(
      id_class = "renderSelectionBoxesIgnoreDepth"
   )
   public final C_extends<Boolean> rE;
   @C_implements(
      id_class = "avoidBreakingMultiplier"
   )
   public final C_extends<Double> rG;
   @C_implements(
      id_class = "maxFallHeightNoWater"
   )
   public final C_extends<Integer> rb;
   @C_implements(
      id_class = "maxYLevelWhileMining"
   )
   public final C_extends<Integer> rM;
   @C_implements(
      id_class = "buildIgnoreBlocks"
   )
   public final C_extends<List<xd_3>> rO;
   @C_implements(
      id_class = "primaryTimeoutMS"
   )
   public final C_extends<Long> rh;
   @C_implements(
      id_class = "desktopNotifications"
   )
   public final C_extends<Boolean> rX;
   @C_implements(
      id_class = "allowWaterBucketFall"
   )
   public final C_extends<Boolean> rJ;
   @C_implements(
      id_class = "legitMineYLevel"
   )
   public final C_extends<Integer> rx;
   @C_implements(
      id_class = "replantNetherWart"
   )
   public final C_extends<Boolean> rd;
   @C_implements(
      id_class = "renderPathIgnoreDepth"
   )
   public final C_extends<Boolean> rk;
   @C_implements(
      id_class = "yLevelBoxSize"
   )
   public final C_extends<Double> rW;
   @C_implements(
      id_class = "rightClickContainerOnArrival"
   )
   public final C_extends<Boolean> rz;
   @C_implements(
      id_class = "goalRenderLineWidthPixels"
   )
   public final C_extends<Float> rQ;
   @C_implements(
      id_class = "assumeStep"
   )
   public final C_extends<Boolean> rN;
   @C_implements(
      id_class = "colorInvertedGoalBox"
   )
   public final C_extends<Color> rc;
   @C_implements(
      id_class = "costVerificationLookahead"
   )
   public final C_extends<Integer> ru;
   @C_implements(
      id_class = "backtrackCostFavoringCoefficient"
   )
   public final C_extends<Double> rm;
   @C_implements(
      id_class = "assumeWalkOnWater"
   )
   public final C_extends<Boolean> rZ;
   @C_implements(
      id_class = "incorrectSize"
   )
   public final C_extends<Integer> rv;
   @C_implements(
      id_class = "internalMiningAirException"
   )
   public final C_extends<Boolean> rF;
   @C_implements(
      id_class = "planAheadFailureTimeoutMS"
   )
   public final C_extends<Long> rL;
   @C_implements(
      id_class = "allowDiagonalAscend"
   )
   public final C_extends<Boolean> rA;
   @C_implements(
      id_class = "fadePath"
   )
   public final C_extends<Boolean> rn;
   @C_implements(
      id_class = "forceInternalMining"
   )
   public final C_extends<Boolean> rC;
   @C_implements(
      id_class = "layerOrder"
   )
   public final C_extends<Boolean> rl;
   @C_implements(
      id_class = "distanceTrim"
   )
   public final C_extends<Boolean> rH;
   @C_implements(
      id_class = "considerPotionEffects"
   )
   public final C_extends<Boolean> ry;
   @C_implements(
      id_class = "censorRanCommands"
   )
   public final C_extends<Boolean> rp;
   @C_implements(
      id_class = "okIfAir"
   )
   public final C_extends<List<xd_3>> rq;
   @C_implements(
      id_class = "slowPathTimeDelayMS"
   )
   public final C_extends<Long> rT;
   @C_implements(
      id_class = "echoCommands"
   )
   public final C_extends<Boolean> rt;
   @C_implements(
      id_class = "chunkPackerQueueMaxSize"
   )
   public final C_extends<Integer> rw;
   @C_implements(
      id_class = "allowBreak"
   )
   public final C_extends<Boolean> rI;
   @C_implements(
      id_class = "colorCurrentPath"
   )
   public final C_extends<Color> rf;
   @C_implements(
      id_class = "assumeWalkOnLava"
   )
   public final C_extends<Boolean> rj;
   @C_implements(
      id_class = "colorBlocksToBreak"
   )
   public final C_extends<Color> rV;
   private static long[] BM;
   @C_implements(
      id_class = "buildValidSubstitutes"
   )
   public final C_extends<Map<xd_3, List<xd_3>>> rg;
   @C_implements(
      id_class = "exploreChunkSetMinimumSize"
   )
   public final C_extends<Integer> rR;
   @C_implements(
      id_class = "strictLiquidCheck"
   )
   public final C_extends<Boolean> rY;
   @C_implements(
      id_class = "logAsToast"
   )
   public final C_extends<Boolean> ro;
   @C_implements(
      id_class = "notificationOnPathComplete"
   )
   public final C_extends<Boolean> rK;
   @C_implements(
      id_class = "colorBlocksToPlace"
   )
   public final C_extends<Color> rD;
   @C_implements(
      id_class = "pathThroughCachedOnly"
   )
   public final C_extends<Boolean> rU;
   @C_implements(
      id_class = "pathingMapDefaultSize"
   )
   public final C_extends<Integer> re;
   @C_implements(
      id_class = "pathCutoffMinimumLength"
   )
   public final C_extends<Integer> ra;
   @C_implements(
      id_class = "colorBestPathSoFar"
   )
   public final C_extends<Color> ri;
   @C_implements(
      id_class = "assumeSafeWalk"
   )
   public final C_extends<Boolean> Pr;
   @C_implements(
      id_class = "toastTimer"
   )
   public final C_extends<Long> PP;
   @C_implements(
      id_class = "allowOnlyExposedOresDistance"
   )
   public final C_extends<Integer> PB;
   @C_implements(
      id_class = "costHeuristic"
   )
   public final C_extends<Double> PS;
   @C_implements(
      id_class = "renderGoal"
   )
   public final C_extends<Boolean> Ps;
   @C_implements(
      id_class = "followOffsetDirection"
   )
   public final C_extends<Float> PE;
   @C_implements(
      id_class = "replantCrops"
   )
   public final C_extends<Boolean> PG;
   @C_implements(
      id_class = "cancelOnGoalInvalidation"
   )
   public final C_extends<Boolean> Pb;
   @C_implements(
      id_class = "notificationOnBuildFinished"
   )
   public final C_extends<Boolean> PM;
   private static double[] BO;
   @C_implements(
      id_class = "rightClickSpeed"
   )
   public final C_extends<Integer> PO;
   @C_implements(
      id_class = "blacklistClosestOnFailure"
   )
   public final C_extends<Boolean> Ph;
   @C_implements(
      id_class = "acceptableThrowawayItems"
   )
   public final C_extends<List<rdb_3>> PX;
   @C_implements(
      id_class = "renderGoalIgnoreDepth"
   )
   public final C_extends<Boolean> PJ;
   @C_implements(
      id_class = "colorBlocksToWalkInto"
   )
   public final C_extends<Color> Px;
   @C_implements(
      id_class = "doBedWaypoints"
   )
   public final C_extends<Boolean> Pd;
   @C_implements(
      id_class = "maxPathHistoryLength"
   )
   public final C_extends<Integer> Pk;
   @C_implements(
      id_class = "allowWalkOnBottomSlab"
   )
   public final C_extends<Boolean> PW;
   @C_implements(
      id_class = "jumpPenalty"
   )
   public final C_extends<Double> Pz;
   @C_implements(
      id_class = "startAtLayer"
   )
   public final C_extends<Integer> PQ;
   @C_implements(
      id_class = "disableCompletionCheck"
   )
   public final C_extends<Boolean> PN;
   @C_implements(
      id_class = "allowSprint"
   )
   public final C_extends<Boolean> Pc;
   @C_implements(
      id_class = "notifier"
   )
   public final C_extends<BiConsumer<String, Boolean>> Pu;
   @C_implements(
      id_class = "worldExploringChunkOffset"
   )
   public final C_extends<Integer> Pm;
   @C_implements(
      id_class = "schematicFallbackExtension"
   )
   public final C_extends<String> PZ;
   @C_implements(
      id_class = "renderGoalAnimated"
   )
   public final C_extends<Boolean> Pv;
   @C_implements(
      id_class = "ticksBetweenInventoryMoves"
   )
   public final C_extends<Integer> PF;
   @C_implements(
      id_class = "pauseMiningForFallingBlocks"
   )
   public final C_extends<Boolean> PL;
   @C_implements(
      id_class = "notificationOnMineFail"
   )
   public final C_extends<Boolean> PA;
   @C_implements(
      id_class = "builderTickScanRadius"
   )
   public final C_extends<Integer> Pn;
   @C_implements(
      id_class = "minimumImprovementRepropagation"
   )
   public final C_extends<Boolean> PC;
   @C_implements(
      id_class = "blocksToDisallowBreaking"
   )
   public final C_extends<List<xd_3>> Pl;
   @C_implements(
      id_class = "failureTimeoutMS"
   )
   public final C_extends<Long> PH;
   @C_implements(
      id_class = "buildIgnoreProperties"
   )
   public final C_extends<List<String>> Py;
   @C_implements(
      id_class = "chatDebug"
   )
   public final C_extends<Boolean> Pp;
   @C_implements(
      id_class = "okIfWater"
   )
   public final C_extends<Boolean> Pq;
   @C_implements(
      id_class = "selectionLineWidth"
   )
   public final C_extends<Float> PT;
   @C_implements(
      id_class = "schematicOrientationY"
   )
   public final C_extends<Boolean> Pt;
   @C_implements(
      id_class = "renderSelectionCorners"
   )
   public final C_extends<Boolean> Pw;
   @C_implements(
      id_class = "splicePath"
   )
   public final C_extends<Boolean> PI;
   @C_implements(
      id_class = "mineGoalUpdateInterval"
   )
   public final C_extends<Integer> Pf;
   public Object[] Pj;
   @C_implements(
      id_class = "mineScanDroppedItems"
   )
   public final C_extends<Boolean> PV;
   @C_implements(
      id_class = "blockBreakSpeed"
   )
   public final C_extends<Integer> Pg;
   @C_implements(
      id_class = "allowDownward"
   )
   public final C_extends<Boolean> PR;
   @C_implements(
      id_class = "sprintAscends"
   )
   public final C_extends<Boolean> PY;
   @C_implements(
      id_class = "colorGoalBox"
   )
   public final C_extends<Color> Po;
   @C_implements(
      id_class = "buildIgnoreExisting"
   )
   public final C_extends<Boolean> PK;
   @C_implements(
      id_class = "blocksToAvoid"
   )
   public final C_extends<List<xd_3>> PD;
   @C_implements(
      id_class = "extendCacheOnThreshold"
   )
   public final C_extends<Boolean> PU;
   @C_implements(
      id_class = "blockPlacementPenalty"
   )
   public final C_extends<Double> Pe;
   @C_implements(
      id_class = "allowParkourPlace"
   )
   public final C_extends<Boolean> Pa;
   @C_implements(
      id_class = "buildOnlySelection"
   )
   public final C_extends<Boolean> Pi;
   @C_implements(
      id_class = "itemSaver"
   )
   public final C_extends<Boolean> Br;
   @C_implements(
      id_class = "mobSpawnerAvoidanceRadius"
   )
   public final C_extends<Integer> BP;
   private static short[] Bh;
   @C_implements(
      id_class = "buildRepeat"
   )
   public final C_extends<rja_3> BB;
   @C_implements(
      id_class = "cachedChunksOpacity"
   )
   public final C_extends<Float> BS;
   private static String[] BX;
   @C_implements(
      id_class = "mapArtMode"
   )
   public final C_extends<Boolean> Bs;

   public boolean byte_() {
      C_class var1 = C_throws.byte_();
      return this.k.class_[0] && !var1.volatile_().byte_() && !var1.break_().byte_() ? true : BG[136];
   }

   public C_private() {
      this.catch_();
      this.rI = new C_extends<>(this, true);
      this.I = new C_extends<>(this, new ArrayList());
      this.Pc = new C_extends<>(this, true);
      this.k = new C_extends<>(this, true);
      this.z = new C_extends<>(this, false);
      this.PF = new C_extends<>(this, 1);
      this.class_ = new C_extends<>(this, false);
      this.rr = new C_extends<>(this, false);
      this.goto_ = new C_extends<>(this, true);
      this.Pe = new C_extends<>(this, 20.0);
      this.rs = new C_extends<>(this, 2.0);
      this.Pz = new C_extends<>(this, 2.0);
      this.int_ = new C_extends<>(this, 3.0);
      this.rY = new C_extends<>(this, false);
      this.rJ = new C_extends<>(this, true);
      this.rZ = new C_extends<>(this, false);
      this.rj = new C_extends<>(this, false);
      this.rN = new C_extends<>(this, false);
      this.Pr = new C_extends<>(this, false);
      this.o = new C_extends<>(this, false);
      this.else_ = new C_extends<>(this, true);
      this.Y = new C_extends<>(this, false);
      this.rA = new C_extends<>(this, false);
      this.PR = new C_extends<>(this, true);
      this.PX = new C_extends<>(this, new ArrayList<>(Arrays.asList(xu_3.finally_.case_(), xu_3.volatile_.case_(), xu_3.PR.case_(), xu_3.break_.case_())));
      this.PD = new C_extends<>(this, new ArrayList());
      this.Pl = new C_extends<>(this, new ArrayList());
      this.p = new C_extends<>(this, new ArrayList<>(Arrays.asList(xu_3.PP, xu_3.Ps, xu_3.re, xu_3.sZ)));
      this.rG = new C_extends<>(this, 0.1);
      this.rO = new C_extends<>(this, new ArrayList<>(Arrays.asList()));
      this.S = new C_extends<>(this, new ArrayList<>(Arrays.asList()));
      this.rg = new C_extends<>(this, new HashMap());
      this.U = new C_extends<>(this, new HashMap());
      this.rq = new C_extends<>(this, new ArrayList<>(Arrays.asList()));
      this.PK = new C_extends<>(this, false);
      this.volatile_ = new C_extends<>(this, false);
      this.Py = new C_extends<>(this, new ArrayList<>(Arrays.asList()));
      this.continue_ = new C_extends<>(this, true);
      this.public_ = new C_extends<>(this, false);
      this.PW = new C_extends<>(this, true);
      this.double_ = new C_extends<>(this, false);
      this.Pa = new C_extends<>(this, false);
      this.ry = new C_extends<>(this, true);
      this.PY = new C_extends<>(this, true);
      this.switch_ = new C_extends<>(this, true);
      this.PL = new C_extends<>(this, true);
      this.PO = new C_extends<>(this, 4);
      this.boolean_ = new C_extends<>(this, 4.5F);
      this.Pg = new C_extends<>(this, 6);
      this.t = new C_extends<>(this, 0.2);
      this.PS = new C_extends<>(this, 3.563);
      this.s = new C_extends<>(this, 50);
      this.rm = new C_extends<>(this, 0.5);
      this.transient_ = new C_extends<>(this, false);
      this.D = new C_extends<>(this, 2.0);
      this.BP = new C_extends<>(this, 16);
      this.this_ = new C_extends<>(this, 1.5);
      this.long_ = new C_extends<>(this, 8);
      this.rz = new C_extends<>(this, true);
      this.P = new C_extends<>(this, true);
      this.PC = new C_extends<>(this, true);
      this.return_ = new C_extends<>(this, false);
      this.u = new C_extends<>(this, 10.0);
      this.ru = new C_extends<>(this, 5);
      this.final_ = new C_extends<>(this, 0.9);
      this.ra = new C_extends<>(this, 30);
      this.H = new C_extends<>(this, 150);
      this.re = new C_extends<>(this, 1024);
      this.a = new C_extends<>(this, 0.75F);
      this.rb = new C_extends<>(this, 3);
      this.extends_ = new C_extends<>(this, 20);
      this.C = new C_extends<>(this, true);
      this.r = new C_extends<>(this, true);
      this.M = new C_extends<>(this, true);
      this.default_ = new C_extends<>(this, 100);
      this.rh = new C_extends<>(this, 500L);
      this.PH = new C_extends<>(this, 2000L);
      this.w = new C_extends<>(this, 4000L);
      this.rL = new C_extends<>(this, 5000L);
      this.synchronized_ = new C_extends<>(this, false);
      this.rT = new C_extends<>(this, 100L);
      this.j = new C_extends<>(this, 40000L);
      this.Pd = new C_extends<>(this, false);
      this.y = new C_extends<>(this, false);
      this.throw_ = new C_extends<>(this, false);
      this.throws_ = new C_extends<>(this, true);
      this.rw = new C_extends<>(this, 2000);
      this.B = new C_extends<>(this, false);
      this.ro = new C_extends<>(this, false);
      this.PP = new C_extends<>(this, 5000L);
      this.Pp = new C_extends<>(this, false);
      this.rB = new C_extends<>(this, true);
      this.Q = new C_extends<>(this, false);
      this.x = new C_extends<>(this, true);
      this.E = new C_extends<>(this, false);
      this.Ps = new C_extends<>(this, true);
      this.Pv = new C_extends<>(this, true);
      this.g = new C_extends<>(this, true);
      this.PJ = new C_extends<>(this, true);
      this.const_ = new C_extends<>(this, false);
      this.rE = new C_extends<>(this, true);
      this.rk = new C_extends<>(this, true);
      this.break_ = new C_extends<>(this, 2.0F);
      this.rQ = new C_extends<>(this, 2.0F);
      this.rn = new C_extends<>(this, true);
      this.n = new C_extends<>(this, true);
      this.private_ = new C_extends<>(this, true);
      this.N = new C_extends<>(this, true);
      this.F = new C_extends<>(this, true);
      this.rU = new C_extends<>(this, false);
      this.finally_ = new C_extends<>(this, true);
      this.Ph = new C_extends<>(this, true);
      this.e = new C_extends<>(this, false);
      this.BS = new C_extends<>(this, 0.5F);
      this.l = new C_extends<>(this, true);
      this.protected_ = new C_extends<>(this, ".");
      this.native_ = new C_extends<>(this, false);
      this.rt = new C_extends<>(this, false);
      this.A = new C_extends<>(this, false);
      this.rp = new C_extends<>(this, false);
      this.Br = new C_extends<>(this, true);
      this.V = new C_extends<>(this, 10);
      this.G = new C_extends<>(this, false);
      this.d = new C_extends<>(this, true);
      this.PI = new C_extends<>(this, true);
      this.Pk = new C_extends<>(this, 300);
      this.void_ = new C_extends<>(this, 50);
      this.Pf = new C_extends<>(this, 5);
      this.c = new C_extends<>(this, 10);
      this.import_ = new C_extends<>(this, 0);
      this.rM = new C_extends<>(this, 255);
      this.Z = new C_extends<>(this, false);
      this.PB = new C_extends<>(this, 1);
      this.b = new C_extends<>(this, true);
      this.Pm = new C_extends<>(this, 0);
      this.rR = new C_extends<>(this, 10);
      this.rP = new C_extends<>(this, 64);
      this.PG = new C_extends<>(this, true);
      this.rd = new C_extends<>(this, false);
      this.f = new C_extends<>(this, 256);
      this.PU = new C_extends<>(this, false);
      this.O = new C_extends<>(this, false);
      this.rl = new C_extends<>(this, false);
      this.new_ = new C_extends<>(this, 1);
      this.PQ = new C_extends<>(this, 0);
      this.X = new C_extends<>(this, false);
      this.Pi = new C_extends<>(this, false);
      this.BB = new C_extends<>(this, new rja_3(0, 0, 0));
      this.case_ = new C_extends<>(this, -1);
      this.static_ = new C_extends<>(this, true);
      this.for_ = new C_extends<>(this, false);
      this.K = new C_extends<>(this, false);
      this.Bs = new C_extends<>(this, false);
      this.Pq = new C_extends<>(this, false);
      this.rv = new C_extends<>(this, 100);
      this.h = new C_extends<>(this, 10.0);
      this.byte_ = new C_extends<>(this, 2.0);
      this.W = new C_extends<>(this, false);
      this.Pt = new C_extends<>(this, false);
      this.v = new C_extends<>(this, false);
      this.PZ = new C_extends<>(this, "schematic");
      this.Pn = new C_extends<>(this, 5);
      this.PV = new C_extends<>(this, true);
      this.q = new C_extends<>(this, 250L);
      this.rH = new C_extends<>(this, true);
      this.Pb = new C_extends<>(this, true);
      this.instanceof_ = new C_extends<>(this, 120);
      this.char_ = new C_extends<>(this, false);
      this.catch_ = new C_extends<>(this, false);
      this.rx = new C_extends<>(this, 11);
      this.i = new C_extends<>(this, false);
      this.rC = new C_extends<>(this, true);
      this.rF = new C_extends<>(this, true);
      this.while_ = new C_extends<>(this, 0.0);
      this.PE = new C_extends<>(this, 0.0F);
      this.T = new C_extends<>(this, 3);
      this.interface_ = new C_extends<>(this, 0);
      this.PN = new C_extends<>(this, false);
      this.strictfp_ = new C_extends<>(this, -1L);
      this.implements_ = new C_extends<>(this, (Consumer<rVe_1>)var0 -> ((cq_3)QY.instanceof_().class_[19]).throws_().class_(var0));
      this.Pu = new C_extends<>(this, Pb_1::class_);
      this.rW = new C_extends<>(this, 15.0);
      this.rf = new C_extends<>(this, Color.RED);
      this.L = new C_extends<>(this, Color.MAGENTA);
      this.rV = new C_extends<>(this, Color.RED);
      this.rD = new C_extends<>(this, Color.GREEN);
      this.Px = new C_extends<>(this, Color.MAGENTA);
      this.ri = new C_extends<>(this, Color.BLUE);
      this.R = new C_extends<>(this, Color.CYAN);
      this.Po = new C_extends<>(this, Color.GREEN);
      this.rc = new C_extends<>(this, Color.RED);
      this.try_ = new C_extends<>(this, Color.CYAN);
      this.short_ = new C_extends<>(this, Color.BLACK);
      this.float_ = new C_extends<>(this, Color.ORANGE);
      this.super_ = new C_extends<>(this, 0.5F);
      this.PT = new C_extends<>(this, 2.0F);
      this.J = new C_extends<>(this, true);
      this.package_ = new C_extends<>(this, true);
      this.Pw = new C_extends<>(this, true);
      this.rS = new C_extends<>(this, true);
      this.rX = new C_extends<>(this, false);
      this.rK = new C_extends<>(this, true);
      this.m = new C_extends<>(this, true);
      this.PM = new C_extends<>(this, true);
      this.abstract_ = new C_extends<>(this, true);
      this.PA = new C_extends<>(this, true);
      Field[] var1 = this.getClass().getFields();
      HashMap var2 = new HashMap();
      ArrayList var3 = new ArrayList();
      HashMap var4 = new HashMap();

      try {
         Field[] var5 = var1;
         int var6 = var1.length;

         for (int var7 = BG[128]; var7 < var6; var7++) {
            Field var8 = var5[var7];
            if (var8.getType().equals(C_extends.class)) {
               if (!var8.isAnnotationPresent(C_implements.class)) {
                  throw new IllegalStateException(BX[2]);
               }

               C_extends var9 = (C_extends)var8.get(this);
               String var10 = var8.getAnnotation(C_implements.class).class_();
               var9.class_[Bh[6]] = var10;
               var10 = var10.toLowerCase();
               if (var2.containsKey(var10)) {
                  throw new IllegalStateException(BX[3]);
               }

               var2.put(var10, var9);
               var3.add(var9);
               var4.put(var9, ((ParameterizedType)var8.getGenericType()).getActualTypeArguments()[BG[129]]);
            }
         }
      } catch (IllegalAccessException var19) {
         throw new IllegalStateException(var19);
      }

      Map var16 = Collections.unmodifiableMap(var2);
      this.Pj[0] = var16;
      List var17 = Collections.unmodifiableList(var3);
      this.Pj[1] = var17;
      Map var18 = Collections.unmodifiableMap(var4);
      this.Pj[2] = var18;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2126059784472664075L;
   }

   public <T> List<C_extends<T>> class_(Class<T> var1) {
      ArrayList var2 = new ArrayList();

      for (C_extends var4 : (List)this.Pj[1]) {
         if (var4.byte_().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, -119, -117, -59, 6, 83, -80, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_() {
      C_class var1 = C_throws.byte_();
      return this.Pa.class_[0] && !var1.break_().byte_() ? true : BG[131];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 920849336;
   }

   public boolean break_() {
      C_class var1 = C_throws.byte_();
      return this.PW.class_[0] && !var1.break_().byte_() ? true : BG[138];
   }

   public boolean throws_() {
      C_class var1 = C_throws.byte_();
      if (!var1.volatile_().byte_() && !var1.abstract_().byte_()) {
         return this.rI.class_[0] && !var1.break_().byte_() ? true : BG[134];
      } else {
         return BG[132];
      }
   }

   private static void finally_() {
      BG = new boolean[]{
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false
      };
   }

   private void catch_() {
      if (this.Pj == null) {
         this.Pj = new Object[3];
         Object[] var1 = this.Pj;
      }
   }

   private static void extends_() {
      BE = new float[]{4.5F, 0.75F, 2.0F, 2.0F, 0.5F, 0.0F, 0.5F, 2.0F};
   }

   public boolean case_() {
      C_class var1 = C_throws.byte_();
      return !var1.break_().byte_() ? true : BG[142];
   }

   private static void implements_() {
      Bb = new byte[]{4, 2, 3, 4, 2, 3, 4, 6, 50, 16, 8, 5, 30, 3, 20, 100, 10, 50, 5, 10, 10, 64, -1, 100, 5, 120, 11, 3, 3};
   }

   public boolean protected_() {
      C_class var1 = C_throws.byte_();
      return this.goto_.class_[0] && !var1.break_().byte_() ? true : BG[140];
   }

   private static void private_() {
      BX = new String[]{
         new String("."), new String("schematic"), new String("Setting field missing SettingName annotation"), new String("Duplicate setting name")
      };
   }

   private static void final_() {
      BM = new long[]{500L, 2000L, 4000L, 5000L, 100L, 40000L, 5000L, 250L, -1L};
   }

   private static void volatile_() {
      Bh = new short[]{150, 1024, 2000, 300, 255, 256, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 19};
   }

   private static void native_() {
      BO = new double[]{20.0, 2.0, 2.0, 3.0, 0.1, 0.2, 3.563, 0.5, 2.0, 1.5, 10.0, 0.9, 10.0, 2.0, 0.0, 15.0};
   }
}
