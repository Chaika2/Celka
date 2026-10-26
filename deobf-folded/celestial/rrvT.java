package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvT {
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static String[] id_protected;
   private static short[] id_throws;

   public AutoSwap id_boolean() {
      return (AutoSwap)this.id_class[58];
   }

   public AutoUse id_char() {
      return (AutoUse)this.id_class[76];
   }

   public AntiAfk id_byte() {
      return (AntiAfk)this.id_class[49];
   }

   public ItemsOverlay id_int() {
      return (ItemsOverlay)this.id_class[84];
   }

   public TriggerBot id_long() {
      return (TriggerBot)this.id_class[77];
   }

   public TapeMouse id_float() {
      return (TapeMouse)this.id_class[62];
   }

   public Esp2D id_double() {
      return (Esp2D)this.id_class[9];
   }

   public rrvT() {
      this.rr();
      ModuleManager var5 = new ModuleManager();
      this.id_class[id_throws[0]] = var5;
      this.rE();
   }

   static {
      ntfClinit();
   }

   public Spider B() {
      return (Spider)this.id_class[20];
   }

   public ProjectileHelper C() {
      return (ProjectileHelper)this.id_class[18];
   }

   public AutoFish D() {
      return (AutoFish)this.id_class[48];
   }

   public LeaveTracker F() {
      return (LeaveTracker)this.id_class[46];
   }

   public StructureTimer I() {
      return (StructureTimer)this.id_class[89];
   }

   public BlockEsp J() {
      return (BlockEsp)this.id_class[50];
   }

   public NoClip S() {
      return (NoClip)this.id_class[31];
   }

   public ItemPhysics Z() {
      return (ItemPhysics)this.id_class[96];
   }

   public ShulkerPreview V() {
      return (ShulkerPreview)this.id_class[95];
   }

   public AutoTotem id_this() {
      return (AutoTotem)this.id_class[29];
   }

   public EventParser e() {
      return (EventParser)this.id_class[34];
   }

   public CreeperFarm i() {
      return (CreeperFarm)this.id_class[90];
   }

   public Strafe b() {
      return (Strafe)this.id_class[42];
   }

   public XRay<?> x() {
      return (XRay<?>)this.id_class[75];
   }

   public AntiBot s() {
      return (AntiBot)this.id_class[69];
   }

   public Crosshair c() {
      return (Crosshair)this.id_class[51];
   }

   public ChinaHat n() {
      return (ChinaHat)this.id_class[28];
   }

   public NoRender h() {
      return (NoRender)this.id_class[15];
   }

   public SwingAnimations f() {
      return (SwingAnimations)this.id_class[32];
   }

   public HitSounds l() {
      return (HitSounds)this.id_class[60];
   }

   public AutoBuy d() {
      return (AutoBuy)this.id_class[81];
   }

   public TpsSync a() {
      return (TpsSync)this.id_class[43];
   }

   public AutoPotion id_interface() {
      return (AutoPotion)this.id_class[24];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3126270250975122470L;
   }

   public void id_class(Module... var1) {
      ((ModuleManager)this.id_class[id_throws[100]]).addAll(List.of(var1));
   }

   public void id_class(boolean var1) {
      ((ModuleManager)this.id_class[id_throws[102]])
         .sort(
            Comparator.comparingDouble(
               var1x -> (double)(
                     -((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[202]])
                        .id_class()
                        .id_break(var1 ? var1x.aH_() : var1x.id_extends())
                  )
            )
         );
   }

   public Nuker id_class() {
      return (Nuker)this.id_class[78];
   }

   public void id_class(int var1) {
      for (Module var3 : (ModuleManager)this.id_class[id_throws[103]]) {
         if (var3.id_package().id_byte() == var1) {
            var3.aw_();
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{11, -76, -36, -38, 113, 68, 122, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(Module var1) {
      ((ModuleManager)this.id_class[id_throws[101]]).add(var1);
   }

   public TimeChanger m() {
      return (TimeChanger)this.id_class[35];
   }

   public StaffViewer o() {
      return (StaffViewer)this.id_class[33];
   }

   public BlocksLift p() {
      return (BlocksLift)this.id_class[65];
   }

   public DeathCoords k() {
      return (DeathCoords)this.id_class[37];
   }

   public FtHelper id_default() {
      return (FtHelper)this.id_class[73];
   }

   public Criticals t() {
      return (Criticals)this.id_class[92];
   }

   public ModuleManager g() {
      return (ModuleManager)this.id_class[id_throws[104]];
   }

   public BowSpam v() {
      return (BowSpam)this.id_class[52];
   }

   public Pointers j() {
      return (Pointers)this.id_class[30];
   }

   public Popka q() {
      return (Popka)this.id_class[97];
   }

   public ClickFriend U() {
      return (ClickFriend)this.id_class[54];
   }

   public AutoLeave id_short() {
      return (AutoLeave)this.id_class[7];
   }

   public AutoRespawn z() {
      return (AutoRespawn)this.id_class[68];
   }

   public AntiShuffler id_void() {
      return (AntiShuffler)this.id_class[38];
   }

   public Hud w() {
      return (Hud)this.id_class[10];
   }

   public FastSwap u() {
      return (FastSwap)this.id_class[83];
   }

   public Velocity r() {
      return (Velocity)this.id_class[3];
   }

   public NoPush y() {
      return (NoPush)this.id_class[8];
   }

   public ChatHelper N() {
      return (ChatHelper)this.id_class[41];
   }

   public ArrayListHud id_break() {
      return (ArrayListHud)this.id_class[11];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 793075880;
   }

   public StreamerMode id_throws() {
      return (StreamerMode)this.id_class[86];
   }

   public AutoExp L() {
      return (AutoExp)this.id_class[67];
   }

   public GhostHand M() {
      return (GhostHand)this.id_class[71];
   }

   public AutoReconnect W() {
      return (AutoReconnect)this.id_class[93];
   }

   public FriendProtect H() {
      return (FriendProtect)this.id_class[53];
   }

   public RwHelper R() {
      return (RwHelper)this.id_class[47];
   }

   public GuiMove P() {
      return (GuiMove)this.id_class[6];
   }

   public FarmBuilder id_finally() {
      return (FarmBuilder)this.id_class[94];
   }

   public PotionTracker id_catch() {
      return (PotionTracker)this.id_class[80];
   }

   public KeepSprint G() {
      return (KeepSprint)this.id_class[2];
   }

   public AutoSprint O() {
      return (AutoSprint)this.id_class[4];
   }

   public NoDelay id_extends() {
      return (NoDelay)this.id_class[17];
   }

   public ClanUpgrader id_goto() {
      return (ClanUpgrader)this.id_class[88];
   }

   public FreeCamera K() {
      return (FreeCamera)this.id_class[5];
   }

   public ClickPearl id_case() {
      return (ClickPearl)this.id_class[14];
   }

   public JumpCircles id_const() {
      return (JumpCircles)this.id_class[27];
   }

   public HwHelper id_continue() {
      return (HwHelper)this.id_class[74];
   }

   public Speed id_else() {
      return (Speed)this.id_class[45];
   }

   public AutoTool id_for() {
      return (AutoTool)this.id_class[79];
   }

   public AutoDuel id_implements() {
      return (AutoDuel)this.id_class[66];
   }

   public NoSlow id_import() {
      return (NoSlow)this.id_class[22];
   }

   public AutoExplosion id_instanceof() {
      return (AutoExplosion)this.id_class[23];
   }

   public Timer id_new() {
      return (Timer)this.id_class[21];
   }

   public HitBoxes id_package() {
      return (HitBoxes)this.id_class[55];
   }

   public ChestStealer id_return() {
      return (ChestStealer)this.id_class[57];
   }

   public FastBreak id_super() {
      return (FastBreak)this.id_class[72];
   }

   public UseTracker id_switch() {
      return (UseTracker)this.id_class[87];
   }

   public AutoAccept id_throw() {
      return (AutoAccept)this.id_class[16];
   }

   public NoServerRots id_try() {
      return (NoServerRots)this.id_class[25];
   }

   public ItemsDelay id_while() {
      return (ItemsDelay)this.id_class[26];
   }

   private static void rs() {
      id_throws = new short[]{
         0,
         5,
         5,
         97,
         1,
         3,
         2,
         4,
         5,
         7,
         6,
         8,
         9,
         10,
         11,
         12,
         14,
         15,
         16,
         13,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         50,
         51,
         52,
         53,
         54,
         55,
         56,
         57,
         58,
         59,
         60,
         61,
         62,
         63,
         64,
         65,
         66,
         67,
         68,
         69,
         70,
         71,
         72,
         73,
         74,
         75,
         76,
         77,
         78,
         79,
         80,
         81,
         82,
         83,
         84,
         85,
         86,
         87,
         88,
         89,
         90,
         91,
         92,
         93,
         94,
         95,
         96,
         0,
         0,
         0,
         0,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         50,
         51,
         52,
         53,
         54,
         55,
         56,
         57,
         58,
         59,
         60,
         61,
         62,
         63,
         64,
         65,
         66,
         67,
         68,
         69,
         70,
         71,
         72,
         73,
         74,
         75,
         76,
         77,
         78,
         79,
         80,
         81,
         82,
         83,
         84,
         85,
         86,
         87,
         88,
         89,
         90,
         91,
         92,
         93,
         94,
         95,
         96,
         97,
         0
      };
   }

   public BaseFinder id_static() {
      return (BaseFinder)this.id_class[91];
   }

   public SuperBow id_public() {
      return (SuperBow)this.id_class[61];
   }

   public AutoAuth id_protected() {
      return (AutoAuth)this.id_class[70];
   }

   public GriefJoiner id_private() {
      return (GriefJoiner)this.id_class[59];
   }

   public ElytraSwap id_abstract() {
      return (ElytraSwap)this.id_class[44];
   }

   public NoInteract id_final() {
      return (NoInteract)this.id_class[40];
   }

   public TotemTracker id_transient() {
      return (TotemTracker)this.id_class[85];
   }

   public Trails id_volatile() {
      return (Trails)this.id_class[12];
   }

   public WaterSpeed id_synchronized() {
      return (WaterSpeed)this.id_class[64];
   }

   public AutoGApple id_native() {
      return (AutoGApple)this.id_class[56];
   }

   public Flight id_strictfp() {
      return (Flight)this.id_class[39];
   }

   public AttackAura E() {
      return (AttackAura)this.id_class[1];
   }

   public ItemScroller A() {
      return (ItemScroller)this.id_class[36];
   }

   public SrpSpoofer T() {
      return (SrpSpoofer)this.id_class[82];
   }

   public Blink X() {
      return (Blink)this.id_class[63];
   }

   public MinecraftOptimizer Q() {
      return (MinecraftOptimizer)this.id_class[13];
   }

   private void rr() {
      if (this.id_class == null) {
         this.id_class = new Object[98];
      }
   }

   private static void rB() {
      id_byte = new byte[]{
         96,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         22,
         23,
         24,
         25,
         26,
         27,
         28,
         29,
         30,
         31,
         32,
         33,
         34,
         35,
         36,
         37,
         38,
         39,
         40,
         41,
         42,
         43,
         44,
         45,
         46,
         47,
         48,
         49,
         50,
         51,
         52,
         53,
         54,
         55,
         56,
         57,
         58,
         59,
         60,
         61,
         62,
         63,
         64,
         65,
         66,
         67,
         68,
         69,
         70,
         71,
         72,
         73,
         74,
         75,
         76,
         77,
         78,
         79,
         80,
         81,
         82,
         83,
         84,
         85,
         86,
         87,
         88,
         89,
         90,
         91,
         92,
         93,
         94,
         95,
         98
      };
   }

   private void rE() {
      this.id_class(new TestFunc());
      this.id_class(new CasinoBot());
      String var1 = ((rrZr_1)rrQJ.id_class[5]).id_protected();
      if (((rrZr_1)rrQJ.id_class[5]).id_protected().equals(id_protected[0])) {
         Popka var6;
         Popka var10001 = var6 = new Popka();
         this.id_class[97] = var6;
         this.id_class(var10001);
      }

      Module[] var103 = new Module[96];
      byte var10003 = id_break[0];
      AttackAura var7;
      AttackAura var10004 = var7 = new AttackAura();
      this.id_class[1] = var7;
      var103[var10003] = var10004;
      Velocity var8;
      Velocity var104 = var8 = new Velocity();
      this.id_class[3] = var8;
      var103[1] = var104;
      KeepSprint var9;
      KeepSprint var105 = var9 = new KeepSprint();
      this.id_class[2] = var9;
      var103[2] = var105;
      AutoSprint var10;
      AutoSprint var106 = var10 = new AutoSprint();
      this.id_class[4] = var10;
      var103[3] = var106;
      FreeCamera var11;
      FreeCamera var107 = var11 = new FreeCamera();
      this.id_class[5] = var11;
      var103[4] = var107;
      AutoLeave var12;
      AutoLeave var108 = var12 = new AutoLeave();
      this.id_class[7] = var12;
      var103[5] = var108;
      GuiMove var13;
      GuiMove var109 = var13 = new GuiMove();
      this.id_class[6] = var13;
      var103[6] = var109;
      NoPush var14;
      NoPush var110 = var14 = new NoPush();
      this.id_class[8] = var14;
      var103[7] = var110;
      Esp2D var15;
      Esp2D var111 = var15 = new Esp2D();
      this.id_class[9] = var15;
      var103[8] = var111;
      Hud var16;
      Hud var112 = var16 = new Hud();
      this.id_class[10] = var16;
      var103[9] = var112;
      ArrayListHud var17;
      ArrayListHud var113 = var17 = new ArrayListHud();
      this.id_class[11] = var17;
      var103[10] = var113;
      Trails var18;
      Trails var114 = var18 = new Trails();
      this.id_class[12] = var18;
      var103[11] = var114;
      ClickPearl var19;
      ClickPearl var115 = var19 = new ClickPearl();
      this.id_class[14] = var19;
      var103[12] = var115;
      NoRender var20;
      NoRender var116 = var20 = new NoRender();
      this.id_class[15] = var20;
      var103[13] = var116;
      AutoAccept var21;
      AutoAccept var117 = var21 = new AutoAccept();
      this.id_class[16] = var21;
      var103[14] = var117;
      MinecraftOptimizer var22;
      MinecraftOptimizer var118 = var22 = new MinecraftOptimizer();
      this.id_class[13] = var22;
      var103[15] = var118;
      NoDelay var23;
      NoDelay var119 = var23 = new NoDelay();
      this.id_class[17] = var23;
      var103[16] = var119;
      ProjectileHelper var24;
      ProjectileHelper var120 = var24 = new ProjectileHelper();
      this.id_class[18] = var24;
      var103[17] = var120;
      Notifications var25;
      Notifications var121 = var25 = new Notifications();
      this.id_class[19] = var25;
      var103[18] = var121;
      Spider var26;
      Spider var122 = var26 = new Spider();
      this.id_class[20] = var26;
      var103[19] = var122;
      Timer var27;
      Timer var123 = var27 = new Timer();
      this.id_class[21] = var27;
      var103[20] = var123;
      NoSlow var28;
      NoSlow var124 = var28 = new NoSlow();
      this.id_class[22] = var28;
      var103[21] = var124;
      AutoExplosion var29;
      AutoExplosion var125 = var29 = new AutoExplosion();
      this.id_class[23] = var29;
      var103[22] = var125;
      AutoPotion var30;
      AutoPotion var126 = var30 = new AutoPotion();
      this.id_class[24] = var30;
      var103[23] = var126;
      NoServerRots var31;
      NoServerRots var127 = var31 = new NoServerRots();
      this.id_class[25] = var31;
      var103[24] = var127;
      ItemsDelay var32;
      ItemsDelay var128 = var32 = new ItemsDelay();
      this.id_class[26] = var32;
      var103[25] = var128;
      JumpCircles var33;
      JumpCircles var129 = var33 = new JumpCircles();
      this.id_class[27] = var33;
      var103[26] = var129;
      ChinaHat var34;
      ChinaHat var130 = var34 = new ChinaHat();
      this.id_class[28] = var34;
      var103[27] = var130;
      AutoTotem var35;
      AutoTotem var131 = var35 = new AutoTotem();
      this.id_class[29] = var35;
      var103[28] = var131;
      Pointers var36;
      Pointers var132 = var36 = new Pointers();
      this.id_class[30] = var36;
      var103[29] = var132;
      NoClip var37;
      NoClip var133 = var37 = new NoClip();
      this.id_class[31] = var37;
      var103[30] = var133;
      SwingAnimations var38;
      SwingAnimations var134 = var38 = new SwingAnimations();
      this.id_class[32] = var38;
      var103[31] = var134;
      StaffViewer var39;
      StaffViewer var135 = var39 = new StaffViewer();
      this.id_class[33] = var39;
      var103[32] = var135;
      EventParser var40;
      EventParser var136 = var40 = new EventParser();
      this.id_class[34] = var40;
      var103[33] = var136;
      TimeChanger var41;
      TimeChanger var137 = var41 = new TimeChanger();
      this.id_class[35] = var41;
      var103[34] = var137;
      ItemScroller var42;
      ItemScroller var138 = var42 = new ItemScroller();
      this.id_class[36] = var42;
      var103[35] = var138;
      DeathCoords var43;
      DeathCoords var139 = var43 = new DeathCoords();
      this.id_class[37] = var43;
      var103[36] = var139;
      AntiShuffler var44;
      AntiShuffler var140 = var44 = new AntiShuffler();
      this.id_class[38] = var44;
      var103[37] = var140;
      Flight var45;
      Flight var141 = var45 = new Flight();
      this.id_class[39] = var45;
      var103[38] = var141;
      NoInteract var46;
      NoInteract var142 = var46 = new NoInteract();
      this.id_class[40] = var46;
      var103[39] = var142;
      ChatHelper var47;
      ChatHelper var143 = var47 = new ChatHelper();
      this.id_class[41] = var47;
      var103[40] = var143;
      Strafe var48;
      Strafe var144 = var48 = new Strafe();
      this.id_class[42] = var48;
      var103[41] = var144;
      TpsSync var49;
      TpsSync var145 = var49 = new TpsSync();
      this.id_class[43] = var49;
      var103[42] = var145;
      ElytraSwap var50;
      ElytraSwap var146 = var50 = new ElytraSwap();
      this.id_class[44] = var50;
      var103[43] = var146;
      Speed var51;
      Speed var147 = var51 = new Speed();
      this.id_class[45] = var51;
      var103[44] = var147;
      LeaveTracker var52;
      LeaveTracker var148 = var52 = new LeaveTracker();
      this.id_class[46] = var52;
      var103[45] = var148;
      RwHelper var53;
      RwHelper var149 = var53 = new RwHelper();
      this.id_class[47] = var53;
      var103[46] = var149;
      AutoFish var54;
      AutoFish var150 = var54 = new AutoFish();
      this.id_class[48] = var54;
      var103[47] = var150;
      AntiAfk var55;
      AntiAfk var151 = var55 = new AntiAfk();
      this.id_class[49] = var55;
      var103[48] = var151;
      BlockEsp var56;
      BlockEsp var152 = var56 = new BlockEsp();
      this.id_class[50] = var56;
      var103[49] = var152;
      Crosshair var57;
      Crosshair var153 = var57 = new Crosshair();
      this.id_class[51] = var57;
      var103[50] = var153;
      BowSpam var58;
      BowSpam var154 = var58 = new BowSpam();
      this.id_class[52] = var58;
      var103[51] = var154;
      FriendProtect var59;
      FriendProtect var155 = var59 = new FriendProtect();
      this.id_class[53] = var59;
      var103[52] = var155;
      ClickFriend var60;
      ClickFriend var156 = var60 = new ClickFriend();
      this.id_class[54] = var60;
      var103[53] = var156;
      HitBoxes var61;
      HitBoxes var157 = var61 = new HitBoxes();
      this.id_class[55] = var61;
      var103[54] = var157;
      AutoGApple var62;
      AutoGApple var158 = var62 = new AutoGApple();
      this.id_class[56] = var62;
      var103[55] = var158;
      ChestStealer var63;
      ChestStealer var159 = var63 = new ChestStealer();
      this.id_class[57] = var63;
      var103[56] = var159;
      AutoSwap var64;
      AutoSwap var160 = var64 = new AutoSwap();
      this.id_class[58] = var64;
      var103[57] = var160;
      GriefJoiner var65;
      GriefJoiner var161 = var65 = new GriefJoiner();
      this.id_class[59] = var65;
      var103[58] = var161;
      HitSounds var66;
      HitSounds var162 = var66 = new HitSounds();
      this.id_class[60] = var66;
      var103[59] = var162;
      SuperBow var67;
      SuperBow var163 = var67 = new SuperBow();
      this.id_class[61] = var67;
      var103[60] = var163;
      TapeMouse var68;
      TapeMouse var164 = var68 = new TapeMouse();
      this.id_class[62] = var68;
      var103[61] = var164;
      Blink var69;
      Blink var165 = var69 = new Blink();
      this.id_class[63] = var69;
      var103[62] = var165;
      WaterSpeed var70;
      WaterSpeed var166 = var70 = new WaterSpeed();
      this.id_class[64] = var70;
      var103[63] = var166;
      BlocksLift var71;
      BlocksLift var167 = var71 = new BlocksLift();
      this.id_class[65] = var71;
      var103[64] = var167;
      AutoDuel var72;
      AutoDuel var168 = var72 = new AutoDuel();
      this.id_class[66] = var72;
      var103[65] = var168;
      AutoExp var73;
      AutoExp var169 = var73 = new AutoExp();
      this.id_class[67] = var73;
      var103[66] = var169;
      AutoRespawn var74;
      AutoRespawn var170 = var74 = new AutoRespawn();
      this.id_class[68] = var74;
      var103[67] = var170;
      AntiBot var75;
      AntiBot var171 = var75 = new AntiBot();
      this.id_class[69] = var75;
      var103[68] = var171;
      AutoAuth var76;
      AutoAuth var172 = var76 = new AutoAuth();
      this.id_class[70] = var76;
      var103[69] = var172;
      GhostHand var77;
      GhostHand var173 = var77 = new GhostHand();
      this.id_class[71] = var77;
      var103[70] = var173;
      FastBreak var78;
      FastBreak var174 = var78 = new FastBreak();
      this.id_class[72] = var78;
      var103[71] = var174;
      FtHelper var79;
      FtHelper var175 = var79 = new FtHelper();
      this.id_class[73] = var79;
      var103[72] = var175;
      HwHelper var80;
      HwHelper var176 = var80 = new HwHelper();
      this.id_class[74] = var80;
      var103[73] = var176;
      XRay var81;
      XRay var177 = var81 = new XRay();
      this.id_class[75] = var81;
      var103[74] = var177;
      AutoUse var82;
      AutoUse var178 = var82 = new AutoUse();
      this.id_class[76] = var82;
      var103[75] = var178;
      TriggerBot var83;
      TriggerBot var179 = var83 = new TriggerBot();
      this.id_class[77] = var83;
      var103[76] = var179;
      Nuker var84;
      Nuker var180 = var84 = new Nuker();
      this.id_class[78] = var84;
      var103[77] = var180;
      AutoTool var85;
      AutoTool var181 = var85 = new AutoTool();
      this.id_class[79] = var85;
      var103[78] = var181;
      PotionTracker var86;
      PotionTracker var182 = var86 = new PotionTracker();
      this.id_class[80] = var86;
      var103[79] = var182;
      AutoBuy var87;
      AutoBuy var183 = var87 = new AutoBuy();
      this.id_class[81] = var87;
      var103[80] = var183;
      SrpSpoofer var88;
      SrpSpoofer var184 = var88 = new SrpSpoofer();
      this.id_class[82] = var88;
      var103[81] = var184;
      FastSwap var89;
      FastSwap var185 = var89 = new FastSwap();
      this.id_class[83] = var89;
      var103[82] = var185;
      ItemsOverlay var90;
      ItemsOverlay var186 = var90 = new ItemsOverlay();
      this.id_class[84] = var90;
      var103[83] = var186;
      TotemTracker var91;
      TotemTracker var187 = var91 = new TotemTracker();
      this.id_class[85] = var91;
      var103[84] = var187;
      StreamerMode var92;
      StreamerMode var188 = var92 = new StreamerMode();
      this.id_class[86] = var92;
      var103[85] = var188;
      UseTracker var93;
      UseTracker var189 = var93 = new UseTracker();
      this.id_class[87] = var93;
      var103[86] = var189;
      ClanUpgrader var94;
      ClanUpgrader var190 = var94 = new ClanUpgrader();
      this.id_class[88] = var94;
      var103[87] = var190;
      StructureTimer var95;
      StructureTimer var191 = var95 = new StructureTimer();
      this.id_class[89] = var95;
      var103[88] = var191;
      CreeperFarm var96;
      CreeperFarm var192 = var96 = new CreeperFarm();
      this.id_class[90] = var96;
      var103[89] = var192;
      BaseFinder var97;
      BaseFinder var193 = var97 = new BaseFinder();
      this.id_class[91] = var97;
      var103[90] = var193;
      Criticals var98;
      Criticals var194 = var98 = new Criticals();
      this.id_class[92] = var98;
      var103[91] = var194;
      AutoReconnect var99;
      AutoReconnect var195 = var99 = new AutoReconnect();
      this.id_class[93] = var99;
      var103[92] = var195;
      FarmBuilder var100;
      FarmBuilder var196 = var100 = new FarmBuilder();
      this.id_class[94] = var100;
      var103[93] = var196;
      ShulkerPreview var101;
      ShulkerPreview var197 = var101 = new ShulkerPreview();
      this.id_class[95] = var101;
      var103[94] = var197;
      ItemPhysics var102;
      ItemPhysics var198 = var102 = new ItemPhysics();
      this.id_class[96] = var102;
      var103[95] = var198;
      this.id_class(var103);
      this.id_class(id_break[2]);
   }

   private static void rP() {
      id_protected = new String[]{new String("2")};
   }

   private static void rS() {
      id_break = new boolean[]{false, true, false};
   }

   public Notifications Y() {
      return (Notifications)this.id_class[19];
   }
}
