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
      return (AutoSwap)this.id_class[id_throws[162]];
   }

   public AutoUse id_char() {
      return (AutoUse)this.id_class[id_throws[180]];
   }

   public AntiAfk id_byte() {
      return (AntiAfk)this.id_class[id_throws[153]];
   }

   public ItemsOverlay id_int() {
      return (ItemsOverlay)this.id_class[id_throws[188]];
   }

   public TriggerBot id_long() {
      return (TriggerBot)this.id_class[id_throws[181]];
   }

   public TapeMouse id_float() {
      return (TapeMouse)this.id_class[id_throws[166]];
   }

   public Esp2D id_double() {
      return (Esp2D)this.id_class[id_throws[113]];
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
      return (Spider)this.id_class[id_throws[124]];
   }

   public ProjectileHelper C() {
      return (ProjectileHelper)this.id_class[id_throws[122]];
   }

   public AutoFish D() {
      return (AutoFish)this.id_class[id_throws[152]];
   }

   public LeaveTracker F() {
      return (LeaveTracker)this.id_class[id_throws[150]];
   }

   public StructureTimer I() {
      return (StructureTimer)this.id_class[id_throws[193]];
   }

   public BlockEsp J() {
      return (BlockEsp)this.id_class[id_throws[154]];
   }

   public NoClip S() {
      return (NoClip)this.id_class[id_throws[135]];
   }

   public ItemPhysics Z() {
      return (ItemPhysics)this.id_class[id_throws[200]];
   }

   public ShulkerPreview V() {
      return (ShulkerPreview)this.id_class[id_throws[199]];
   }

   public AutoTotem id_this() {
      return (AutoTotem)this.id_class[id_throws[133]];
   }

   public EventParser e() {
      return (EventParser)this.id_class[id_throws[138]];
   }

   public CreeperFarm i() {
      return (CreeperFarm)this.id_class[id_throws[194]];
   }

   public Strafe b() {
      return (Strafe)this.id_class[id_throws[146]];
   }

   public XRay<?> x() {
      return (XRay<?>)this.id_class[id_throws[179]];
   }

   public AntiBot s() {
      return (AntiBot)this.id_class[id_throws[173]];
   }

   public Crosshair c() {
      return (Crosshair)this.id_class[id_throws[155]];
   }

   public ChinaHat n() {
      return (ChinaHat)this.id_class[id_throws[132]];
   }

   public NoRender h() {
      return (NoRender)this.id_class[id_throws[119]];
   }

   public SwingAnimations f() {
      return (SwingAnimations)this.id_class[id_throws[136]];
   }

   public HitSounds l() {
      return (HitSounds)this.id_class[id_throws[164]];
   }

   public AutoBuy d() {
      return (AutoBuy)this.id_class[id_throws[185]];
   }

   public TpsSync a() {
      return (TpsSync)this.id_class[id_throws[147]];
   }

   public AutoPotion id_interface() {
      return (AutoPotion)this.id_class[id_throws[128]];
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
      return (Nuker)this.id_class[id_throws[182]];
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
      return (TimeChanger)this.id_class[id_throws[139]];
   }

   public StaffViewer o() {
      return (StaffViewer)this.id_class[id_throws[137]];
   }

   public BlocksLift p() {
      return (BlocksLift)this.id_class[id_throws[169]];
   }

   public DeathCoords k() {
      return (DeathCoords)this.id_class[id_throws[141]];
   }

   public FtHelper id_default() {
      return (FtHelper)this.id_class[id_throws[177]];
   }

   public Criticals t() {
      return (Criticals)this.id_class[id_throws[196]];
   }

   public ModuleManager g() {
      return (ModuleManager)this.id_class[id_throws[104]];
   }

   public BowSpam v() {
      return (BowSpam)this.id_class[id_throws[156]];
   }

   public Pointers j() {
      return (Pointers)this.id_class[id_throws[134]];
   }

   public Popka q() {
      return (Popka)this.id_class[id_throws[201]];
   }

   public ClickFriend U() {
      return (ClickFriend)this.id_class[id_throws[158]];
   }

   public AutoLeave id_short() {
      return (AutoLeave)this.id_class[id_throws[111]];
   }

   public AutoRespawn z() {
      return (AutoRespawn)this.id_class[id_throws[172]];
   }

   public AntiShuffler id_void() {
      return (AntiShuffler)this.id_class[id_throws[142]];
   }

   public Hud w() {
      return (Hud)this.id_class[id_throws[114]];
   }

   public FastSwap u() {
      return (FastSwap)this.id_class[id_throws[187]];
   }

   public Velocity r() {
      return (Velocity)this.id_class[id_throws[107]];
   }

   public NoPush y() {
      return (NoPush)this.id_class[id_throws[112]];
   }

   public ChatHelper N() {
      return (ChatHelper)this.id_class[id_throws[145]];
   }

   public ArrayListHud id_break() {
      return (ArrayListHud)this.id_class[id_throws[115]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 793075880;
   }

   public StreamerMode id_throws() {
      return (StreamerMode)this.id_class[id_throws[190]];
   }

   public AutoExp L() {
      return (AutoExp)this.id_class[id_throws[171]];
   }

   public GhostHand M() {
      return (GhostHand)this.id_class[id_throws[175]];
   }

   public AutoReconnect W() {
      return (AutoReconnect)this.id_class[id_throws[197]];
   }

   public FriendProtect H() {
      return (FriendProtect)this.id_class[id_throws[157]];
   }

   public RwHelper R() {
      return (RwHelper)this.id_class[id_throws[151]];
   }

   public GuiMove P() {
      return (GuiMove)this.id_class[id_throws[110]];
   }

   public FarmBuilder id_finally() {
      return (FarmBuilder)this.id_class[id_throws[198]];
   }

   public PotionTracker id_catch() {
      return (PotionTracker)this.id_class[id_throws[184]];
   }

   public KeepSprint G() {
      return (KeepSprint)this.id_class[id_throws[106]];
   }

   public AutoSprint O() {
      return (AutoSprint)this.id_class[id_throws[108]];
   }

   public NoDelay id_extends() {
      return (NoDelay)this.id_class[id_throws[121]];
   }

   public ClanUpgrader id_goto() {
      return (ClanUpgrader)this.id_class[id_throws[192]];
   }

   public FreeCamera K() {
      return (FreeCamera)this.id_class[id_throws[109]];
   }

   public ClickPearl id_case() {
      return (ClickPearl)this.id_class[id_throws[118]];
   }

   public JumpCircles id_const() {
      return (JumpCircles)this.id_class[id_throws[131]];
   }

   public HwHelper id_continue() {
      return (HwHelper)this.id_class[id_throws[178]];
   }

   public Speed id_else() {
      return (Speed)this.id_class[id_throws[149]];
   }

   public AutoTool id_for() {
      return (AutoTool)this.id_class[id_throws[183]];
   }

   public AutoDuel id_implements() {
      return (AutoDuel)this.id_class[id_throws[170]];
   }

   public NoSlow id_import() {
      return (NoSlow)this.id_class[id_throws[126]];
   }

   public AutoExplosion id_instanceof() {
      return (AutoExplosion)this.id_class[id_throws[127]];
   }

   public Timer id_new() {
      return (Timer)this.id_class[id_throws[125]];
   }

   public HitBoxes id_package() {
      return (HitBoxes)this.id_class[id_throws[159]];
   }

   public ChestStealer id_return() {
      return (ChestStealer)this.id_class[id_throws[161]];
   }

   public FastBreak id_super() {
      return (FastBreak)this.id_class[id_throws[176]];
   }

   public UseTracker id_switch() {
      return (UseTracker)this.id_class[id_throws[191]];
   }

   public AutoAccept id_throw() {
      return (AutoAccept)this.id_class[id_throws[120]];
   }

   public NoServerRots id_try() {
      return (NoServerRots)this.id_class[id_throws[129]];
   }

   public ItemsDelay id_while() {
      return (ItemsDelay)this.id_class[id_throws[130]];
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
      return (BaseFinder)this.id_class[id_throws[195]];
   }

   public SuperBow id_public() {
      return (SuperBow)this.id_class[id_throws[165]];
   }

   public AutoAuth id_protected() {
      return (AutoAuth)this.id_class[id_throws[174]];
   }

   public GriefJoiner id_private() {
      return (GriefJoiner)this.id_class[id_throws[163]];
   }

   public ElytraSwap id_abstract() {
      return (ElytraSwap)this.id_class[id_throws[148]];
   }

   public NoInteract id_final() {
      return (NoInteract)this.id_class[id_throws[144]];
   }

   public TotemTracker id_transient() {
      return (TotemTracker)this.id_class[id_throws[189]];
   }

   public Trails id_volatile() {
      return (Trails)this.id_class[id_throws[116]];
   }

   public WaterSpeed id_synchronized() {
      return (WaterSpeed)this.id_class[id_throws[168]];
   }

   public AutoGApple id_native() {
      return (AutoGApple)this.id_class[id_throws[160]];
   }

   public Flight id_strictfp() {
      return (Flight)this.id_class[id_throws[143]];
   }

   public AttackAura E() {
      return (AttackAura)this.id_class[id_throws[105]];
   }

   public ItemScroller A() {
      return (ItemScroller)this.id_class[id_throws[140]];
   }

   public SrpSpoofer T() {
      return (SrpSpoofer)this.id_class[id_throws[186]];
   }

   public Blink X() {
      return (Blink)this.id_class[id_throws[167]];
   }

   public MinecraftOptimizer Q() {
      return (MinecraftOptimizer)this.id_class[id_throws[117]];
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
      String var1 = ((rrZr_1)rrQJ.id_class[id_throws[1]]).id_protected();
      if (((rrZr_1)rrQJ.id_class[id_throws[2]]).id_protected().equals(id_protected[0])) {
         Popka var6;
         Popka var10001 = var6 = new Popka();
         this.id_class[id_throws[3]] = var6;
         this.id_class(var10001);
      }

      Module[] var103 = new Module[id_byte[0]];
      byte var10003 = id_break[0];
      AttackAura var7;
      AttackAura var10004 = var7 = new AttackAura();
      this.id_class[id_throws[4]] = var7;
      var103[var10003] = var10004;
      var10003 = id_break[1];
      Velocity var8;
      Velocity var199 = var8 = new Velocity();
      this.id_class[id_throws[5]] = var8;
      var103[var10003] = var199;
      var10003 = id_byte[1];
      KeepSprint var9;
      KeepSprint var200 = var9 = new KeepSprint();
      this.id_class[id_throws[6]] = var9;
      var103[var10003] = var200;
      var10003 = id_byte[2];
      AutoSprint var10;
      AutoSprint var201 = var10 = new AutoSprint();
      this.id_class[id_throws[7]] = var10;
      var103[var10003] = var201;
      var10003 = id_byte[3];
      FreeCamera var11;
      FreeCamera var202 = var11 = new FreeCamera();
      this.id_class[id_throws[8]] = var11;
      var103[var10003] = var202;
      var10003 = id_byte[4];
      AutoLeave var12;
      AutoLeave var203 = var12 = new AutoLeave();
      this.id_class[id_throws[9]] = var12;
      var103[var10003] = var203;
      var10003 = id_byte[5];
      GuiMove var13;
      GuiMove var204 = var13 = new GuiMove();
      this.id_class[id_throws[10]] = var13;
      var103[var10003] = var204;
      var10003 = id_byte[6];
      NoPush var14;
      NoPush var205 = var14 = new NoPush();
      this.id_class[id_throws[11]] = var14;
      var103[var10003] = var205;
      var10003 = id_byte[7];
      Esp2D var15;
      Esp2D var206 = var15 = new Esp2D();
      this.id_class[id_throws[12]] = var15;
      var103[var10003] = var206;
      var10003 = id_byte[8];
      Hud var16;
      Hud var207 = var16 = new Hud();
      this.id_class[id_throws[13]] = var16;
      var103[var10003] = var207;
      var10003 = id_byte[9];
      ArrayListHud var17;
      ArrayListHud var208 = var17 = new ArrayListHud();
      this.id_class[id_throws[14]] = var17;
      var103[var10003] = var208;
      var10003 = id_byte[10];
      Trails var18;
      Trails var209 = var18 = new Trails();
      this.id_class[id_throws[15]] = var18;
      var103[var10003] = var209;
      var10003 = id_byte[11];
      ClickPearl var19;
      ClickPearl var210 = var19 = new ClickPearl();
      this.id_class[id_throws[16]] = var19;
      var103[var10003] = var210;
      var10003 = id_byte[12];
      NoRender var20;
      NoRender var211 = var20 = new NoRender();
      this.id_class[id_throws[17]] = var20;
      var103[var10003] = var211;
      var10003 = id_byte[13];
      AutoAccept var21;
      AutoAccept var212 = var21 = new AutoAccept();
      this.id_class[id_throws[18]] = var21;
      var103[var10003] = var212;
      var10003 = id_byte[14];
      MinecraftOptimizer var22;
      MinecraftOptimizer var213 = var22 = new MinecraftOptimizer();
      this.id_class[id_throws[19]] = var22;
      var103[var10003] = var213;
      var10003 = id_byte[15];
      NoDelay var23;
      NoDelay var214 = var23 = new NoDelay();
      this.id_class[id_throws[20]] = var23;
      var103[var10003] = var214;
      var10003 = id_byte[16];
      ProjectileHelper var24;
      ProjectileHelper var215 = var24 = new ProjectileHelper();
      this.id_class[id_throws[21]] = var24;
      var103[var10003] = var215;
      var10003 = id_byte[17];
      Notifications var25;
      Notifications var216 = var25 = new Notifications();
      this.id_class[id_throws[22]] = var25;
      var103[var10003] = var216;
      var10003 = id_byte[18];
      Spider var26;
      Spider var217 = var26 = new Spider();
      this.id_class[id_throws[23]] = var26;
      var103[var10003] = var217;
      var10003 = id_byte[19];
      Timer var27;
      Timer var218 = var27 = new Timer();
      this.id_class[id_throws[24]] = var27;
      var103[var10003] = var218;
      var10003 = id_byte[20];
      NoSlow var28;
      NoSlow var219 = var28 = new NoSlow();
      this.id_class[id_throws[25]] = var28;
      var103[var10003] = var219;
      var10003 = id_byte[21];
      AutoExplosion var29;
      AutoExplosion var220 = var29 = new AutoExplosion();
      this.id_class[id_throws[26]] = var29;
      var103[var10003] = var220;
      var10003 = id_byte[22];
      AutoPotion var30;
      AutoPotion var221 = var30 = new AutoPotion();
      this.id_class[id_throws[27]] = var30;
      var103[var10003] = var221;
      var10003 = id_byte[23];
      NoServerRots var31;
      NoServerRots var222 = var31 = new NoServerRots();
      this.id_class[id_throws[28]] = var31;
      var103[var10003] = var222;
      var10003 = id_byte[24];
      ItemsDelay var32;
      ItemsDelay var223 = var32 = new ItemsDelay();
      this.id_class[id_throws[29]] = var32;
      var103[var10003] = var223;
      var10003 = id_byte[25];
      JumpCircles var33;
      JumpCircles var224 = var33 = new JumpCircles();
      this.id_class[id_throws[30]] = var33;
      var103[var10003] = var224;
      var10003 = id_byte[26];
      ChinaHat var34;
      ChinaHat var225 = var34 = new ChinaHat();
      this.id_class[id_throws[31]] = var34;
      var103[var10003] = var225;
      var10003 = id_byte[27];
      AutoTotem var35;
      AutoTotem var226 = var35 = new AutoTotem();
      this.id_class[id_throws[32]] = var35;
      var103[var10003] = var226;
      var10003 = id_byte[28];
      Pointers var36;
      Pointers var227 = var36 = new Pointers();
      this.id_class[id_throws[33]] = var36;
      var103[var10003] = var227;
      var10003 = id_byte[29];
      NoClip var37;
      NoClip var228 = var37 = new NoClip();
      this.id_class[id_throws[34]] = var37;
      var103[var10003] = var228;
      var10003 = id_byte[30];
      SwingAnimations var38;
      SwingAnimations var229 = var38 = new SwingAnimations();
      this.id_class[id_throws[35]] = var38;
      var103[var10003] = var229;
      var10003 = id_byte[31];
      StaffViewer var39;
      StaffViewer var230 = var39 = new StaffViewer();
      this.id_class[id_throws[36]] = var39;
      var103[var10003] = var230;
      var10003 = id_byte[32];
      EventParser var40;
      EventParser var231 = var40 = new EventParser();
      this.id_class[id_throws[37]] = var40;
      var103[var10003] = var231;
      var10003 = id_byte[33];
      TimeChanger var41;
      TimeChanger var232 = var41 = new TimeChanger();
      this.id_class[id_throws[38]] = var41;
      var103[var10003] = var232;
      var10003 = id_byte[34];
      ItemScroller var42;
      ItemScroller var233 = var42 = new ItemScroller();
      this.id_class[id_throws[39]] = var42;
      var103[var10003] = var233;
      var10003 = id_byte[35];
      DeathCoords var43;
      DeathCoords var234 = var43 = new DeathCoords();
      this.id_class[id_throws[40]] = var43;
      var103[var10003] = var234;
      var10003 = id_byte[36];
      AntiShuffler var44;
      AntiShuffler var235 = var44 = new AntiShuffler();
      this.id_class[id_throws[41]] = var44;
      var103[var10003] = var235;
      var10003 = id_byte[37];
      Flight var45;
      Flight var236 = var45 = new Flight();
      this.id_class[id_throws[42]] = var45;
      var103[var10003] = var236;
      var10003 = id_byte[38];
      NoInteract var46;
      NoInteract var237 = var46 = new NoInteract();
      this.id_class[id_throws[43]] = var46;
      var103[var10003] = var237;
      var10003 = id_byte[39];
      ChatHelper var47;
      ChatHelper var238 = var47 = new ChatHelper();
      this.id_class[id_throws[44]] = var47;
      var103[var10003] = var238;
      var10003 = id_byte[40];
      Strafe var48;
      Strafe var239 = var48 = new Strafe();
      this.id_class[id_throws[45]] = var48;
      var103[var10003] = var239;
      var10003 = id_byte[41];
      TpsSync var49;
      TpsSync var240 = var49 = new TpsSync();
      this.id_class[id_throws[46]] = var49;
      var103[var10003] = var240;
      var10003 = id_byte[42];
      ElytraSwap var50;
      ElytraSwap var241 = var50 = new ElytraSwap();
      this.id_class[id_throws[47]] = var50;
      var103[var10003] = var241;
      var10003 = id_byte[43];
      Speed var51;
      Speed var242 = var51 = new Speed();
      this.id_class[id_throws[48]] = var51;
      var103[var10003] = var242;
      var10003 = id_byte[44];
      LeaveTracker var52;
      LeaveTracker var243 = var52 = new LeaveTracker();
      this.id_class[id_throws[49]] = var52;
      var103[var10003] = var243;
      var10003 = id_byte[45];
      RwHelper var53;
      RwHelper var244 = var53 = new RwHelper();
      this.id_class[id_throws[50]] = var53;
      var103[var10003] = var244;
      var10003 = id_byte[46];
      AutoFish var54;
      AutoFish var245 = var54 = new AutoFish();
      this.id_class[id_throws[51]] = var54;
      var103[var10003] = var245;
      var10003 = id_byte[47];
      AntiAfk var55;
      AntiAfk var246 = var55 = new AntiAfk();
      this.id_class[id_throws[52]] = var55;
      var103[var10003] = var246;
      var10003 = id_byte[48];
      BlockEsp var56;
      BlockEsp var247 = var56 = new BlockEsp();
      this.id_class[id_throws[53]] = var56;
      var103[var10003] = var247;
      var10003 = id_byte[49];
      Crosshair var57;
      Crosshair var248 = var57 = new Crosshair();
      this.id_class[id_throws[54]] = var57;
      var103[var10003] = var248;
      var10003 = id_byte[50];
      BowSpam var58;
      BowSpam var249 = var58 = new BowSpam();
      this.id_class[id_throws[55]] = var58;
      var103[var10003] = var249;
      var10003 = id_byte[51];
      FriendProtect var59;
      FriendProtect var250 = var59 = new FriendProtect();
      this.id_class[id_throws[56]] = var59;
      var103[var10003] = var250;
      var10003 = id_byte[52];
      ClickFriend var60;
      ClickFriend var251 = var60 = new ClickFriend();
      this.id_class[id_throws[57]] = var60;
      var103[var10003] = var251;
      var10003 = id_byte[53];
      HitBoxes var61;
      HitBoxes var252 = var61 = new HitBoxes();
      this.id_class[id_throws[58]] = var61;
      var103[var10003] = var252;
      var10003 = id_byte[54];
      AutoGApple var62;
      AutoGApple var253 = var62 = new AutoGApple();
      this.id_class[id_throws[59]] = var62;
      var103[var10003] = var253;
      var10003 = id_byte[55];
      ChestStealer var63;
      ChestStealer var254 = var63 = new ChestStealer();
      this.id_class[id_throws[60]] = var63;
      var103[var10003] = var254;
      var10003 = id_byte[56];
      AutoSwap var64;
      AutoSwap var255 = var64 = new AutoSwap();
      this.id_class[id_throws[61]] = var64;
      var103[var10003] = var255;
      var10003 = id_byte[57];
      GriefJoiner var65;
      GriefJoiner var256 = var65 = new GriefJoiner();
      this.id_class[id_throws[62]] = var65;
      var103[var10003] = var256;
      var10003 = id_byte[58];
      HitSounds var66;
      HitSounds var257 = var66 = new HitSounds();
      this.id_class[id_throws[63]] = var66;
      var103[var10003] = var257;
      var10003 = id_byte[59];
      SuperBow var67;
      SuperBow var258 = var67 = new SuperBow();
      this.id_class[id_throws[64]] = var67;
      var103[var10003] = var258;
      var10003 = id_byte[60];
      TapeMouse var68;
      TapeMouse var259 = var68 = new TapeMouse();
      this.id_class[id_throws[65]] = var68;
      var103[var10003] = var259;
      var10003 = id_byte[61];
      Blink var69;
      Blink var260 = var69 = new Blink();
      this.id_class[id_throws[66]] = var69;
      var103[var10003] = var260;
      var10003 = id_byte[62];
      WaterSpeed var70;
      WaterSpeed var261 = var70 = new WaterSpeed();
      this.id_class[id_throws[67]] = var70;
      var103[var10003] = var261;
      var10003 = id_byte[63];
      BlocksLift var71;
      BlocksLift var262 = var71 = new BlocksLift();
      this.id_class[id_throws[68]] = var71;
      var103[var10003] = var262;
      var10003 = id_byte[64];
      AutoDuel var72;
      AutoDuel var263 = var72 = new AutoDuel();
      this.id_class[id_throws[69]] = var72;
      var103[var10003] = var263;
      var10003 = id_byte[65];
      AutoExp var73;
      AutoExp var264 = var73 = new AutoExp();
      this.id_class[id_throws[70]] = var73;
      var103[var10003] = var264;
      var10003 = id_byte[66];
      AutoRespawn var74;
      AutoRespawn var265 = var74 = new AutoRespawn();
      this.id_class[id_throws[71]] = var74;
      var103[var10003] = var265;
      var10003 = id_byte[67];
      AntiBot var75;
      AntiBot var266 = var75 = new AntiBot();
      this.id_class[id_throws[72]] = var75;
      var103[var10003] = var266;
      var10003 = id_byte[68];
      AutoAuth var76;
      AutoAuth var267 = var76 = new AutoAuth();
      this.id_class[id_throws[73]] = var76;
      var103[var10003] = var267;
      var10003 = id_byte[69];
      GhostHand var77;
      GhostHand var268 = var77 = new GhostHand();
      this.id_class[id_throws[74]] = var77;
      var103[var10003] = var268;
      var10003 = id_byte[70];
      FastBreak var78;
      FastBreak var269 = var78 = new FastBreak();
      this.id_class[id_throws[75]] = var78;
      var103[var10003] = var269;
      var10003 = id_byte[71];
      FtHelper var79;
      FtHelper var270 = var79 = new FtHelper();
      this.id_class[id_throws[76]] = var79;
      var103[var10003] = var270;
      var10003 = id_byte[72];
      HwHelper var80;
      HwHelper var271 = var80 = new HwHelper();
      this.id_class[id_throws[77]] = var80;
      var103[var10003] = var271;
      var10003 = id_byte[73];
      XRay var81;
      XRay var272 = var81 = new XRay();
      this.id_class[id_throws[78]] = var81;
      var103[var10003] = var272;
      var10003 = id_byte[74];
      AutoUse var82;
      AutoUse var273 = var82 = new AutoUse();
      this.id_class[id_throws[79]] = var82;
      var103[var10003] = var273;
      var10003 = id_byte[75];
      TriggerBot var83;
      TriggerBot var274 = var83 = new TriggerBot();
      this.id_class[id_throws[80]] = var83;
      var103[var10003] = var274;
      var10003 = id_byte[76];
      Nuker var84;
      Nuker var275 = var84 = new Nuker();
      this.id_class[id_throws[81]] = var84;
      var103[var10003] = var275;
      var10003 = id_byte[77];
      AutoTool var85;
      AutoTool var276 = var85 = new AutoTool();
      this.id_class[id_throws[82]] = var85;
      var103[var10003] = var276;
      var10003 = id_byte[78];
      PotionTracker var86;
      PotionTracker var277 = var86 = new PotionTracker();
      this.id_class[id_throws[83]] = var86;
      var103[var10003] = var277;
      var10003 = id_byte[79];
      AutoBuy var87;
      AutoBuy var278 = var87 = new AutoBuy();
      this.id_class[id_throws[84]] = var87;
      var103[var10003] = var278;
      var10003 = id_byte[80];
      SrpSpoofer var88;
      SrpSpoofer var279 = var88 = new SrpSpoofer();
      this.id_class[id_throws[85]] = var88;
      var103[var10003] = var279;
      var10003 = id_byte[81];
      FastSwap var89;
      FastSwap var280 = var89 = new FastSwap();
      this.id_class[id_throws[86]] = var89;
      var103[var10003] = var280;
      var10003 = id_byte[82];
      ItemsOverlay var90;
      ItemsOverlay var281 = var90 = new ItemsOverlay();
      this.id_class[id_throws[87]] = var90;
      var103[var10003] = var281;
      var10003 = id_byte[83];
      TotemTracker var91;
      TotemTracker var282 = var91 = new TotemTracker();
      this.id_class[id_throws[88]] = var91;
      var103[var10003] = var282;
      var10003 = id_byte[84];
      StreamerMode var92;
      StreamerMode var283 = var92 = new StreamerMode();
      this.id_class[id_throws[89]] = var92;
      var103[var10003] = var283;
      var10003 = id_byte[85];
      UseTracker var93;
      UseTracker var284 = var93 = new UseTracker();
      this.id_class[id_throws[90]] = var93;
      var103[var10003] = var284;
      var10003 = id_byte[86];
      ClanUpgrader var94;
      ClanUpgrader var285 = var94 = new ClanUpgrader();
      this.id_class[id_throws[91]] = var94;
      var103[var10003] = var285;
      var10003 = id_byte[87];
      StructureTimer var95;
      StructureTimer var286 = var95 = new StructureTimer();
      this.id_class[id_throws[92]] = var95;
      var103[var10003] = var286;
      var10003 = id_byte[88];
      CreeperFarm var96;
      CreeperFarm var287 = var96 = new CreeperFarm();
      this.id_class[id_throws[93]] = var96;
      var103[var10003] = var287;
      var10003 = id_byte[89];
      BaseFinder var97;
      BaseFinder var288 = var97 = new BaseFinder();
      this.id_class[id_throws[94]] = var97;
      var103[var10003] = var288;
      var10003 = id_byte[90];
      Criticals var98;
      Criticals var289 = var98 = new Criticals();
      this.id_class[id_throws[95]] = var98;
      var103[var10003] = var289;
      var10003 = id_byte[91];
      AutoReconnect var99;
      AutoReconnect var290 = var99 = new AutoReconnect();
      this.id_class[id_throws[96]] = var99;
      var103[var10003] = var290;
      var10003 = id_byte[92];
      FarmBuilder var100;
      FarmBuilder var291 = var100 = new FarmBuilder();
      this.id_class[id_throws[97]] = var100;
      var103[var10003] = var291;
      var10003 = id_byte[93];
      ShulkerPreview var101;
      ShulkerPreview var292 = var101 = new ShulkerPreview();
      this.id_class[id_throws[98]] = var101;
      var103[var10003] = var292;
      var10003 = id_byte[94];
      ItemPhysics var102;
      ItemPhysics var293 = var102 = new ItemPhysics();
      this.id_class[id_throws[99]] = var102;
      var103[var10003] = var293;
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
      return (Notifications)this.id_class[id_throws[123]];
   }
}
