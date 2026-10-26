/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.manager.FontManager;
import celestial.module.Module;
import celestial.module.ModuleManager;
import celestial.module.combat.AntiBot;
import celestial.module.combat.AttackAura;
import celestial.module.combat.AutoDuel;
import celestial.module.combat.AutoExplosion;
import celestial.module.combat.AutoGApple;
import celestial.module.combat.AutoPotion;
import celestial.module.combat.AutoSwap;
import celestial.module.combat.AutoTotem;
import celestial.module.combat.AutoUse;
import celestial.module.combat.BowSpam;
import celestial.module.combat.Criticals;
import celestial.module.combat.FastSwap;
import celestial.module.combat.FriendProtect;
import celestial.module.combat.HitBoxes;
import celestial.module.combat.HitSounds;
import celestial.module.combat.Popka;
import celestial.module.combat.SuperBow;
import celestial.module.combat.TapeMouse;
import celestial.module.combat.TriggerBot;
import celestial.module.combat.Velocity;
import celestial.module.movement.AutoSprint;
import celestial.module.movement.Blink;
import celestial.module.movement.BlocksLift;
import celestial.module.movement.Flight;
import celestial.module.movement.GuiMove;
import celestial.module.movement.KeepSprint;
import celestial.module.movement.NoClip;
import celestial.module.movement.NoSlow;
import celestial.module.movement.Speed;
import celestial.module.movement.Spider;
import celestial.module.movement.Strafe;
import celestial.module.movement.Timer;
import celestial.module.movement.WaterSpeed;
import celestial.module.player.AutoExp;
import celestial.module.player.AutoFish;
import celestial.module.player.AutoLeave;
import celestial.module.player.AutoReconnect;
import celestial.module.player.AutoRespawn;
import celestial.module.player.AutoTool;
import celestial.module.player.ChestStealer;
import celestial.module.player.ElytraSwap;
import celestial.module.player.FastBreak;
import celestial.module.player.FreeCamera;
import celestial.module.player.GhostHand;
import celestial.module.player.ItemsDelay;
import celestial.module.player.NoDelay;
import celestial.module.player.NoInteract;
import celestial.module.player.NoPush;
import celestial.module.player.NoServerRots;
import celestial.module.player.Nuker;
import celestial.module.player.ProjectileHelper;
import celestial.module.player.StreamerMode;
import celestial.module.render.ArrayListHud;
import celestial.module.render.BlockEsp;
import celestial.module.render.ChinaHat;
import celestial.module.render.Crosshair;
import celestial.module.render.DeathCoords;
import celestial.module.render.Esp2D;
import celestial.module.render.Hud;
import celestial.module.render.ItemPhysics;
import celestial.module.render.JumpCircles;
import celestial.module.render.NoRender;
import celestial.module.render.Notifications;
import celestial.module.render.Pointers;
import celestial.module.render.ShulkerPreview;
import celestial.module.render.StaffViewer;
import celestial.module.render.StructureTimer;
import celestial.module.render.SwingAnimations;
import celestial.module.render.TimeChanger;
import celestial.module.render.Trails;
import celestial.module.util.AntiAfk;
import celestial.module.util.AntiShuffler;
import celestial.module.util.AutoAccept;
import celestial.module.util.AutoAuth;
import celestial.module.util.AutoBuy;
import celestial.module.util.BaseFinder;
import celestial.module.util.CasinoBot;
import celestial.module.util.ChatHelper;
import celestial.module.util.ClanUpgrader;
import celestial.module.util.ClickFriend;
import celestial.module.util.ClickPearl;
import celestial.module.util.CreeperFarm;
import celestial.module.util.EventParser;
import celestial.module.util.FarmBuilder;
import celestial.module.util.FtHelper;
import celestial.module.util.GriefJoiner;
import celestial.module.util.HwHelper;
import celestial.module.util.ItemScroller;
import celestial.module.util.ItemsOverlay;
import celestial.module.util.LeaveTracker;
import celestial.module.util.MinecraftOptimizer;
import celestial.module.util.PotionTracker;
import celestial.module.util.RwHelper;
import celestial.module.util.SrpSpoofer;
import celestial.module.util.TestFunc;
import celestial.module.util.TotemTracker;
import celestial.module.util.TpsSync;
import celestial.module.util.UseTracker;
import celestial.module.util.XRay;
import celestial.rrQJ;
import celestial.rrZr_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
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
        ModuleManager moduleManager = new ModuleManager();
        this.id_class[rrvT.id_throws[0]] = moduleManager;
        this.rE();
    }

    static {
        rrvT.ntfClinit();
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
        return (XRay)this.id_class[id_throws[179]];
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

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD49D41C53AC1ABDAL;
    }

    public void id_class(Module ... moduleArray) {
        ((ModuleManager)this.id_class[id_throws[100]]).addAll(List.of(moduleArray));
    }

    public void id_class(boolean bl) {
        ((ModuleManager)this.id_class[id_throws[102]]).sort(Comparator.comparingDouble(module -> -((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[202]]).id_class().id_break(bl ? module.aH_() : module.id_extends())));
    }

    public Nuker id_class() {
        return (Nuker)this.id_class[id_throws[182]];
    }

    public void id_class(int n) {
        for (Module module : (ModuleManager)this.id_class[id_throws[103]]) {
            if (module.id_package().id_byte() != n) continue;
            module.aw_();
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{11, -76, -36, -38, 113, 68, 122, -104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(Module module) {
        ((ModuleManager)this.id_class[id_throws[101]]).add(module);
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

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2F4560A8;
    }

    public StreamerMode id_throws() {
        return (StreamerMode)this.id_class[id_throws[190]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrvT.rS();
        rrvT.rP();
        rrvT.rs();
        rrvT.rB();
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
        short[] sArray = new short[203];
        sArray[1] = 5;
        sArray[2] = 5;
        sArray[3] = 97;
        sArray[4] = 1;
        sArray[5] = 3;
        sArray[6] = 2;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 7;
        sArray[10] = 6;
        sArray[11] = 8;
        sArray[12] = 9;
        sArray[13] = 10;
        sArray[14] = 11;
        sArray[15] = 12;
        sArray[16] = 14;
        sArray[17] = 15;
        sArray[18] = 16;
        sArray[19] = 13;
        sArray[20] = 17;
        sArray[21] = 18;
        sArray[22] = 19;
        sArray[23] = 20;
        sArray[24] = 21;
        sArray[25] = 22;
        sArray[26] = 23;
        sArray[27] = 24;
        sArray[28] = 25;
        sArray[29] = 26;
        sArray[30] = 27;
        sArray[31] = 28;
        sArray[32] = 29;
        sArray[33] = 30;
        sArray[34] = 31;
        sArray[35] = 32;
        sArray[36] = 33;
        sArray[37] = 34;
        sArray[38] = 35;
        sArray[39] = 36;
        sArray[40] = 37;
        sArray[41] = 38;
        sArray[42] = 39;
        sArray[43] = 40;
        sArray[44] = 41;
        sArray[45] = 42;
        sArray[46] = 43;
        sArray[47] = 44;
        sArray[48] = 45;
        sArray[49] = 46;
        sArray[50] = 47;
        sArray[51] = 48;
        sArray[52] = 49;
        sArray[53] = 50;
        sArray[54] = 51;
        sArray[55] = 52;
        sArray[56] = 53;
        sArray[57] = 54;
        sArray[58] = 55;
        sArray[59] = 56;
        sArray[60] = 57;
        sArray[61] = 58;
        sArray[62] = 59;
        sArray[63] = 60;
        sArray[64] = 61;
        sArray[65] = 62;
        sArray[66] = 63;
        sArray[67] = 64;
        sArray[68] = 65;
        sArray[69] = 66;
        sArray[70] = 67;
        sArray[71] = 68;
        sArray[72] = 69;
        sArray[73] = 70;
        sArray[74] = 71;
        sArray[75] = 72;
        sArray[76] = 73;
        sArray[77] = 74;
        sArray[78] = 75;
        sArray[79] = 76;
        sArray[80] = 77;
        sArray[81] = 78;
        sArray[82] = 79;
        sArray[83] = 80;
        sArray[84] = 81;
        sArray[85] = 82;
        sArray[86] = 83;
        sArray[87] = 84;
        sArray[88] = 85;
        sArray[89] = 86;
        sArray[90] = 87;
        sArray[91] = 88;
        sArray[92] = 89;
        sArray[93] = 90;
        sArray[94] = 91;
        sArray[95] = 92;
        sArray[96] = 93;
        sArray[97] = 94;
        sArray[98] = 95;
        sArray[99] = 96;
        sArray[105] = 1;
        sArray[106] = 2;
        sArray[107] = 3;
        sArray[108] = 4;
        sArray[109] = 5;
        sArray[110] = 6;
        sArray[111] = 7;
        sArray[112] = 8;
        sArray[113] = 9;
        sArray[114] = 10;
        sArray[115] = 11;
        sArray[116] = 12;
        sArray[117] = 13;
        sArray[118] = 14;
        sArray[119] = 15;
        sArray[120] = 16;
        sArray[121] = 17;
        sArray[122] = 18;
        sArray[123] = 19;
        sArray[124] = 20;
        sArray[125] = 21;
        sArray[126] = 22;
        sArray[127] = 23;
        sArray[128] = 24;
        sArray[129] = 25;
        sArray[130] = 26;
        sArray[131] = 27;
        sArray[132] = 28;
        sArray[133] = 29;
        sArray[134] = 30;
        sArray[135] = 31;
        sArray[136] = 32;
        sArray[137] = 33;
        sArray[138] = 34;
        sArray[139] = 35;
        sArray[140] = 36;
        sArray[141] = 37;
        sArray[142] = 38;
        sArray[143] = 39;
        sArray[144] = 40;
        sArray[145] = 41;
        sArray[146] = 42;
        sArray[147] = 43;
        sArray[148] = 44;
        sArray[149] = 45;
        sArray[150] = 46;
        sArray[151] = 47;
        sArray[152] = 48;
        sArray[153] = 49;
        sArray[154] = 50;
        sArray[155] = 51;
        sArray[156] = 52;
        sArray[157] = 53;
        sArray[158] = 54;
        sArray[159] = 55;
        sArray[160] = 56;
        sArray[161] = 57;
        sArray[162] = 58;
        sArray[163] = 59;
        sArray[164] = 60;
        sArray[165] = 61;
        sArray[166] = 62;
        sArray[167] = 63;
        sArray[168] = 64;
        sArray[169] = 65;
        sArray[170] = 66;
        sArray[171] = 67;
        sArray[172] = 68;
        sArray[173] = 69;
        sArray[174] = 70;
        sArray[175] = 71;
        sArray[176] = 72;
        sArray[177] = 73;
        sArray[178] = 74;
        sArray[179] = 75;
        sArray[180] = 76;
        sArray[181] = 77;
        sArray[182] = 78;
        sArray[183] = 79;
        sArray[184] = 80;
        sArray[185] = 81;
        sArray[186] = 82;
        sArray[187] = 83;
        sArray[188] = 84;
        sArray[189] = 85;
        sArray[190] = 86;
        sArray[191] = 87;
        sArray[192] = 88;
        sArray[193] = 89;
        sArray[194] = 90;
        sArray[195] = 91;
        sArray[196] = 92;
        sArray[197] = 93;
        sArray[198] = 94;
        sArray[199] = 95;
        sArray[200] = 96;
        sArray[201] = 97;
        id_throws = sArray;
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
        id_byte = new byte[]{96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 98};
    }

    private void rE() {
        XRay xRay;
        this.id_class((Module)new TestFunc());
        this.id_class((Module)new CasinoBot());
        String string = ((rrZr_1)rrQJ.id_class[id_throws[1]]).id_protected();
        if (((rrZr_1)rrQJ.id_class[id_throws[2]]).id_protected().equals(id_protected[0])) {
            Popka popka = new Popka();
            this.id_class[rrvT.id_throws[3]] = popka;
            this.id_class((Module)popka);
        }
        Module[] moduleArray = new Module[id_byte[0]];
        AttackAura attackAura = new AttackAura();
        this.id_class[rrvT.id_throws[4]] = attackAura;
        moduleArray[rrvT.id_break[0]] = attackAura;
        Velocity velocity = new Velocity();
        this.id_class[rrvT.id_throws[5]] = velocity;
        moduleArray[rrvT.id_break[1]] = velocity;
        KeepSprint keepSprint = new KeepSprint();
        this.id_class[rrvT.id_throws[6]] = keepSprint;
        moduleArray[rrvT.id_byte[1]] = keepSprint;
        AutoSprint autoSprint = new AutoSprint();
        this.id_class[rrvT.id_throws[7]] = autoSprint;
        moduleArray[rrvT.id_byte[2]] = autoSprint;
        FreeCamera freeCamera = new FreeCamera();
        this.id_class[rrvT.id_throws[8]] = freeCamera;
        moduleArray[rrvT.id_byte[3]] = freeCamera;
        AutoLeave autoLeave = new AutoLeave();
        this.id_class[rrvT.id_throws[9]] = autoLeave;
        moduleArray[rrvT.id_byte[4]] = autoLeave;
        GuiMove guiMove = new GuiMove();
        this.id_class[rrvT.id_throws[10]] = guiMove;
        moduleArray[rrvT.id_byte[5]] = guiMove;
        NoPush noPush = new NoPush();
        this.id_class[rrvT.id_throws[11]] = noPush;
        moduleArray[rrvT.id_byte[6]] = noPush;
        Esp2D esp2D = new Esp2D();
        this.id_class[rrvT.id_throws[12]] = esp2D;
        moduleArray[rrvT.id_byte[7]] = esp2D;
        Hud hud = new Hud();
        this.id_class[rrvT.id_throws[13]] = hud;
        moduleArray[rrvT.id_byte[8]] = hud;
        ArrayListHud arrayListHud = new ArrayListHud();
        this.id_class[rrvT.id_throws[14]] = arrayListHud;
        moduleArray[rrvT.id_byte[9]] = arrayListHud;
        Trails trails = new Trails();
        this.id_class[rrvT.id_throws[15]] = trails;
        moduleArray[rrvT.id_byte[10]] = trails;
        ClickPearl clickPearl = new ClickPearl();
        this.id_class[rrvT.id_throws[16]] = clickPearl;
        moduleArray[rrvT.id_byte[11]] = clickPearl;
        NoRender noRender = new NoRender();
        this.id_class[rrvT.id_throws[17]] = noRender;
        moduleArray[rrvT.id_byte[12]] = noRender;
        AutoAccept autoAccept = new AutoAccept();
        this.id_class[rrvT.id_throws[18]] = autoAccept;
        moduleArray[rrvT.id_byte[13]] = autoAccept;
        MinecraftOptimizer minecraftOptimizer = new MinecraftOptimizer();
        this.id_class[rrvT.id_throws[19]] = minecraftOptimizer;
        moduleArray[rrvT.id_byte[14]] = minecraftOptimizer;
        NoDelay noDelay = new NoDelay();
        this.id_class[rrvT.id_throws[20]] = noDelay;
        moduleArray[rrvT.id_byte[15]] = noDelay;
        ProjectileHelper projectileHelper = new ProjectileHelper();
        this.id_class[rrvT.id_throws[21]] = projectileHelper;
        moduleArray[rrvT.id_byte[16]] = projectileHelper;
        Notifications notifications = new Notifications();
        this.id_class[rrvT.id_throws[22]] = notifications;
        moduleArray[rrvT.id_byte[17]] = notifications;
        Spider spider = new Spider();
        this.id_class[rrvT.id_throws[23]] = spider;
        moduleArray[rrvT.id_byte[18]] = spider;
        Timer timer = new Timer();
        this.id_class[rrvT.id_throws[24]] = timer;
        moduleArray[rrvT.id_byte[19]] = timer;
        NoSlow noSlow = new NoSlow();
        this.id_class[rrvT.id_throws[25]] = noSlow;
        moduleArray[rrvT.id_byte[20]] = noSlow;
        AutoExplosion autoExplosion = new AutoExplosion();
        this.id_class[rrvT.id_throws[26]] = autoExplosion;
        moduleArray[rrvT.id_byte[21]] = autoExplosion;
        AutoPotion autoPotion = new AutoPotion();
        this.id_class[rrvT.id_throws[27]] = autoPotion;
        moduleArray[rrvT.id_byte[22]] = autoPotion;
        NoServerRots noServerRots = new NoServerRots();
        this.id_class[rrvT.id_throws[28]] = noServerRots;
        moduleArray[rrvT.id_byte[23]] = noServerRots;
        ItemsDelay itemsDelay = new ItemsDelay();
        this.id_class[rrvT.id_throws[29]] = itemsDelay;
        moduleArray[rrvT.id_byte[24]] = itemsDelay;
        JumpCircles jumpCircles = new JumpCircles();
        this.id_class[rrvT.id_throws[30]] = jumpCircles;
        moduleArray[rrvT.id_byte[25]] = jumpCircles;
        ChinaHat chinaHat = new ChinaHat();
        this.id_class[rrvT.id_throws[31]] = chinaHat;
        moduleArray[rrvT.id_byte[26]] = chinaHat;
        AutoTotem autoTotem = new AutoTotem();
        this.id_class[rrvT.id_throws[32]] = autoTotem;
        moduleArray[rrvT.id_byte[27]] = autoTotem;
        Pointers pointers = new Pointers();
        this.id_class[rrvT.id_throws[33]] = pointers;
        moduleArray[rrvT.id_byte[28]] = pointers;
        NoClip noClip = new NoClip();
        this.id_class[rrvT.id_throws[34]] = noClip;
        moduleArray[rrvT.id_byte[29]] = noClip;
        SwingAnimations swingAnimations = new SwingAnimations();
        this.id_class[rrvT.id_throws[35]] = swingAnimations;
        moduleArray[rrvT.id_byte[30]] = swingAnimations;
        StaffViewer staffViewer = new StaffViewer();
        this.id_class[rrvT.id_throws[36]] = staffViewer;
        moduleArray[rrvT.id_byte[31]] = staffViewer;
        EventParser eventParser = new EventParser();
        this.id_class[rrvT.id_throws[37]] = eventParser;
        moduleArray[rrvT.id_byte[32]] = eventParser;
        TimeChanger timeChanger = new TimeChanger();
        this.id_class[rrvT.id_throws[38]] = timeChanger;
        moduleArray[rrvT.id_byte[33]] = timeChanger;
        ItemScroller itemScroller = new ItemScroller();
        this.id_class[rrvT.id_throws[39]] = itemScroller;
        moduleArray[rrvT.id_byte[34]] = itemScroller;
        DeathCoords deathCoords = new DeathCoords();
        this.id_class[rrvT.id_throws[40]] = deathCoords;
        moduleArray[rrvT.id_byte[35]] = deathCoords;
        AntiShuffler antiShuffler = new AntiShuffler();
        this.id_class[rrvT.id_throws[41]] = antiShuffler;
        moduleArray[rrvT.id_byte[36]] = antiShuffler;
        Flight flight = new Flight();
        this.id_class[rrvT.id_throws[42]] = flight;
        moduleArray[rrvT.id_byte[37]] = flight;
        NoInteract noInteract = new NoInteract();
        this.id_class[rrvT.id_throws[43]] = noInteract;
        moduleArray[rrvT.id_byte[38]] = noInteract;
        ChatHelper chatHelper = new ChatHelper();
        this.id_class[rrvT.id_throws[44]] = chatHelper;
        moduleArray[rrvT.id_byte[39]] = chatHelper;
        Strafe strafe = new Strafe();
        this.id_class[rrvT.id_throws[45]] = strafe;
        moduleArray[rrvT.id_byte[40]] = strafe;
        TpsSync tpsSync = new TpsSync();
        this.id_class[rrvT.id_throws[46]] = tpsSync;
        moduleArray[rrvT.id_byte[41]] = tpsSync;
        ElytraSwap elytraSwap = new ElytraSwap();
        this.id_class[rrvT.id_throws[47]] = elytraSwap;
        moduleArray[rrvT.id_byte[42]] = elytraSwap;
        Speed speed = new Speed();
        this.id_class[rrvT.id_throws[48]] = speed;
        moduleArray[rrvT.id_byte[43]] = speed;
        LeaveTracker leaveTracker = new LeaveTracker();
        this.id_class[rrvT.id_throws[49]] = leaveTracker;
        moduleArray[rrvT.id_byte[44]] = leaveTracker;
        RwHelper rwHelper = new RwHelper();
        this.id_class[rrvT.id_throws[50]] = rwHelper;
        moduleArray[rrvT.id_byte[45]] = rwHelper;
        AutoFish autoFish = new AutoFish();
        this.id_class[rrvT.id_throws[51]] = autoFish;
        moduleArray[rrvT.id_byte[46]] = autoFish;
        AntiAfk antiAfk = new AntiAfk();
        this.id_class[rrvT.id_throws[52]] = antiAfk;
        moduleArray[rrvT.id_byte[47]] = antiAfk;
        BlockEsp blockEsp = new BlockEsp();
        this.id_class[rrvT.id_throws[53]] = blockEsp;
        moduleArray[rrvT.id_byte[48]] = blockEsp;
        Crosshair crosshair = new Crosshair();
        this.id_class[rrvT.id_throws[54]] = crosshair;
        moduleArray[rrvT.id_byte[49]] = crosshair;
        BowSpam bowSpam = new BowSpam();
        this.id_class[rrvT.id_throws[55]] = bowSpam;
        moduleArray[rrvT.id_byte[50]] = bowSpam;
        FriendProtect friendProtect = new FriendProtect();
        this.id_class[rrvT.id_throws[56]] = friendProtect;
        moduleArray[rrvT.id_byte[51]] = friendProtect;
        ClickFriend clickFriend = new ClickFriend();
        this.id_class[rrvT.id_throws[57]] = clickFriend;
        moduleArray[rrvT.id_byte[52]] = clickFriend;
        HitBoxes hitBoxes = new HitBoxes();
        this.id_class[rrvT.id_throws[58]] = hitBoxes;
        moduleArray[rrvT.id_byte[53]] = hitBoxes;
        AutoGApple autoGApple = new AutoGApple();
        this.id_class[rrvT.id_throws[59]] = autoGApple;
        moduleArray[rrvT.id_byte[54]] = autoGApple;
        ChestStealer chestStealer = new ChestStealer();
        this.id_class[rrvT.id_throws[60]] = chestStealer;
        moduleArray[rrvT.id_byte[55]] = chestStealer;
        AutoSwap autoSwap = new AutoSwap();
        this.id_class[rrvT.id_throws[61]] = autoSwap;
        moduleArray[rrvT.id_byte[56]] = autoSwap;
        GriefJoiner griefJoiner = new GriefJoiner();
        this.id_class[rrvT.id_throws[62]] = griefJoiner;
        moduleArray[rrvT.id_byte[57]] = griefJoiner;
        HitSounds hitSounds = new HitSounds();
        this.id_class[rrvT.id_throws[63]] = hitSounds;
        moduleArray[rrvT.id_byte[58]] = hitSounds;
        SuperBow superBow = new SuperBow();
        this.id_class[rrvT.id_throws[64]] = superBow;
        moduleArray[rrvT.id_byte[59]] = superBow;
        TapeMouse tapeMouse = new TapeMouse();
        this.id_class[rrvT.id_throws[65]] = tapeMouse;
        moduleArray[rrvT.id_byte[60]] = tapeMouse;
        Blink blink = new Blink();
        this.id_class[rrvT.id_throws[66]] = blink;
        moduleArray[rrvT.id_byte[61]] = blink;
        WaterSpeed waterSpeed = new WaterSpeed();
        this.id_class[rrvT.id_throws[67]] = waterSpeed;
        moduleArray[rrvT.id_byte[62]] = waterSpeed;
        BlocksLift blocksLift = new BlocksLift();
        this.id_class[rrvT.id_throws[68]] = blocksLift;
        moduleArray[rrvT.id_byte[63]] = blocksLift;
        AutoDuel autoDuel = new AutoDuel();
        this.id_class[rrvT.id_throws[69]] = autoDuel;
        moduleArray[rrvT.id_byte[64]] = autoDuel;
        AutoExp autoExp = new AutoExp();
        this.id_class[rrvT.id_throws[70]] = autoExp;
        moduleArray[rrvT.id_byte[65]] = autoExp;
        AutoRespawn autoRespawn = new AutoRespawn();
        this.id_class[rrvT.id_throws[71]] = autoRespawn;
        moduleArray[rrvT.id_byte[66]] = autoRespawn;
        AntiBot antiBot = new AntiBot();
        this.id_class[rrvT.id_throws[72]] = antiBot;
        moduleArray[rrvT.id_byte[67]] = antiBot;
        AutoAuth autoAuth = new AutoAuth();
        this.id_class[rrvT.id_throws[73]] = autoAuth;
        moduleArray[rrvT.id_byte[68]] = autoAuth;
        GhostHand ghostHand = new GhostHand();
        this.id_class[rrvT.id_throws[74]] = ghostHand;
        moduleArray[rrvT.id_byte[69]] = ghostHand;
        FastBreak fastBreak = new FastBreak();
        this.id_class[rrvT.id_throws[75]] = fastBreak;
        moduleArray[rrvT.id_byte[70]] = fastBreak;
        FtHelper ftHelper = new FtHelper();
        this.id_class[rrvT.id_throws[76]] = ftHelper;
        moduleArray[rrvT.id_byte[71]] = ftHelper;
        HwHelper hwHelper = new HwHelper();
        this.id_class[rrvT.id_throws[77]] = hwHelper;
        moduleArray[rrvT.id_byte[72]] = hwHelper;
        this.id_class[rrvT.id_throws[78]] = xRay = new XRay();
        moduleArray[rrvT.id_byte[73]] = xRay;
        AutoUse autoUse = new AutoUse();
        this.id_class[rrvT.id_throws[79]] = autoUse;
        moduleArray[rrvT.id_byte[74]] = autoUse;
        TriggerBot triggerBot = new TriggerBot();
        this.id_class[rrvT.id_throws[80]] = triggerBot;
        moduleArray[rrvT.id_byte[75]] = triggerBot;
        Nuker nuker = new Nuker();
        this.id_class[rrvT.id_throws[81]] = nuker;
        moduleArray[rrvT.id_byte[76]] = nuker;
        AutoTool autoTool = new AutoTool();
        this.id_class[rrvT.id_throws[82]] = autoTool;
        moduleArray[rrvT.id_byte[77]] = autoTool;
        PotionTracker potionTracker = new PotionTracker();
        this.id_class[rrvT.id_throws[83]] = potionTracker;
        moduleArray[rrvT.id_byte[78]] = potionTracker;
        AutoBuy autoBuy = new AutoBuy();
        this.id_class[rrvT.id_throws[84]] = autoBuy;
        moduleArray[rrvT.id_byte[79]] = autoBuy;
        SrpSpoofer srpSpoofer = new SrpSpoofer();
        this.id_class[rrvT.id_throws[85]] = srpSpoofer;
        moduleArray[rrvT.id_byte[80]] = srpSpoofer;
        FastSwap fastSwap = new FastSwap();
        this.id_class[rrvT.id_throws[86]] = fastSwap;
        moduleArray[rrvT.id_byte[81]] = fastSwap;
        ItemsOverlay itemsOverlay = new ItemsOverlay();
        this.id_class[rrvT.id_throws[87]] = itemsOverlay;
        moduleArray[rrvT.id_byte[82]] = itemsOverlay;
        TotemTracker totemTracker = new TotemTracker();
        this.id_class[rrvT.id_throws[88]] = totemTracker;
        moduleArray[rrvT.id_byte[83]] = totemTracker;
        StreamerMode streamerMode = new StreamerMode();
        this.id_class[rrvT.id_throws[89]] = streamerMode;
        moduleArray[rrvT.id_byte[84]] = streamerMode;
        UseTracker useTracker = new UseTracker();
        this.id_class[rrvT.id_throws[90]] = useTracker;
        moduleArray[rrvT.id_byte[85]] = useTracker;
        ClanUpgrader clanUpgrader = new ClanUpgrader();
        this.id_class[rrvT.id_throws[91]] = clanUpgrader;
        moduleArray[rrvT.id_byte[86]] = clanUpgrader;
        StructureTimer structureTimer = new StructureTimer();
        this.id_class[rrvT.id_throws[92]] = structureTimer;
        moduleArray[rrvT.id_byte[87]] = structureTimer;
        CreeperFarm creeperFarm = new CreeperFarm();
        this.id_class[rrvT.id_throws[93]] = creeperFarm;
        moduleArray[rrvT.id_byte[88]] = creeperFarm;
        BaseFinder baseFinder = new BaseFinder();
        this.id_class[rrvT.id_throws[94]] = baseFinder;
        moduleArray[rrvT.id_byte[89]] = baseFinder;
        Criticals criticals = new Criticals();
        this.id_class[rrvT.id_throws[95]] = criticals;
        moduleArray[rrvT.id_byte[90]] = criticals;
        AutoReconnect autoReconnect = new AutoReconnect();
        this.id_class[rrvT.id_throws[96]] = autoReconnect;
        moduleArray[rrvT.id_byte[91]] = autoReconnect;
        FarmBuilder farmBuilder = new FarmBuilder();
        this.id_class[rrvT.id_throws[97]] = farmBuilder;
        moduleArray[rrvT.id_byte[92]] = farmBuilder;
        ShulkerPreview shulkerPreview = new ShulkerPreview();
        this.id_class[rrvT.id_throws[98]] = shulkerPreview;
        moduleArray[rrvT.id_byte[93]] = shulkerPreview;
        ItemPhysics itemPhysics = new ItemPhysics();
        this.id_class[rrvT.id_throws[99]] = itemPhysics;
        moduleArray[rrvT.id_byte[94]] = itemPhysics;
        this.id_class(moduleArray);
        this.id_class(id_break[2]);
    }

    private static void rP() {
        id_protected = new String[]{new String("2")};
    }

    private static void rS() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        id_break = blArray;
    }

    public Notifications Y() {
        return (Notifications)this.id_class[id_throws[123]];
    }
}

