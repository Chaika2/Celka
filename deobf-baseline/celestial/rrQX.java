package celestial;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQX implements MinecraftAccessor {
   public Object[] fields09f1f28026cd378cb9df490a64ac8f2a;
   private static byte[] bytes09f1f28026cd378cb9df490a64ac8f2a;
   private static short[] shorts09f1f28026cd378cb9df490a64ac8f2a;
   private static String[] strings09f1f28026cd378cb9df490a64ac8f2a;
   private static boolean[] booleans09f1f28026cd378cb9df490a64ac8f2a;
   public static Object[] staticFields09f1f28026cd378cb9df490a64ac8f2a;

   public ClickGuiScreen id_byte() {
      return (ClickGuiScreen)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[38]];
   }

   private static void id_int() {
      bytes09f1f28026cd378cb9df490a64ac8f2a = new byte[]{2, 3, 24, 9, 4, 2};
   }

   private rrQX() {
      this.id_native();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7213762120603438659L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1312094857;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, -48, 11, -46, -56, 110, -82, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrvV id_class() {
      return (rrvV)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[33]];
   }

   public ConfigManager id_break() {
      return (ConfigManager)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[31]];
   }

   public rrwe_3 id_throws() {
      return (rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[36]];
   }

   public OA id_finally() {
      return (OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[39]];
   }

   public rrIJ id_catch() {
      return (rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[34]];
   }

   public void id_extends() {
      ((OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[24]]).id_class(rrLM.id_class());
      ((rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[25]]).id_catch();
      ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[26]])
         .id_byte(strings09f1f28026cd378cb9df490a64ac8f2a[2], booleans09f1f28026cd378cb9df490a64ac8f2a[6]);
      ((rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[27]])
         .id_byte(strings09f1f28026cd378cb9df490a64ac8f2a[3], booleans09f1f28026cd378cb9df490a64ac8f2a[7]);
      ((rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[28]]).id_class();
      ((Qw_1)id_import.id_class[shorts09f1f28026cd378cb9df490a64ac8f2a[29]]).id_break();
      ((rrZP)rrZP.staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[shorts09f1f28026cd378cb9df490a64ac8f2a[30]]).id_class();
   }

   public boolean id_case() {
      ((rruc_1)rruc_1.staticFields8976bba2dba834c8b8aad687eeef9d7a[shorts09f1f28026cd378cb9df490a64ac8f2a[1]]).id_break();
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[shorts09f1f28026cd378cb9df490a64ac8f2a[2]]).id_volatile();
      OC var6 = new OC();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[3]] = var6;
      ((OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[4]]).id_class(this.getClass().getPackageName(), (var0, var1) -> {
         Object[] var10002 = new Object[bytes09f1f28026cd378cb9df490a64ac8f2a[0]];
         var10002[booleans09f1f28026cd378cb9df490a64ac8f2a[8]] = var1;
         var10002[booleans09f1f28026cd378cb9df490a64ac8f2a[9]] = MethodHandles.lookup();
         return (Lookup)var0.invoke(null, var10002);
      });
      ((rrZP)rrZP.staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[shorts09f1f28026cd378cb9df490a64ac8f2a[5]]).id_break();
      rrjC_2.id_break();
      C_throws.id_class().id_break();
      ConfigManager var7 = new ConfigManager();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[6]] = var7;
      rrvT var8 = new rrvT();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[7]] = var8;
      rrwe_3 var9 = new rrwe_3();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[8]] = var9;
      rrIJ var10 = new rrIJ();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[9]] = var10;
      rrwY_2 var11 = new rrwY_2();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[10]] = var11;
      rrvV var12 = new rrvV();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[11]] = var12;
      rrwN_2 var13 = new rrwN_2();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[12]] = var13;
      ((rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[13]]).id_break();
      ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[14]])
         .id_class(strings09f1f28026cd378cb9df490a64ac8f2a[0], booleans09f1f28026cd378cb9df490a64ac8f2a[0]);
      ((rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[15]]).id_break(booleans09f1f28026cd378cb9df490a64ac8f2a[1]);
      ((rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[16]]).id_byte();
      ClickGuiScreen var14 = new ClickGuiScreen();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[17]] = var14;
      ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[18]])
         .id_class(strings09f1f28026cd378cb9df490a64ac8f2a[1], booleans09f1f28026cd378cb9df490a64ac8f2a[2]);
      rrjC_2.id_protected().id_class(rrjC_2.id_protected().id_class());
      ((rrwq_3)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[shorts09f1f28026cd378cb9df490a64ac8f2a[19]]).id_byte();
      new rrCS();
      Runtime.getRuntime()
         .addShutdownHook(new Thread(((rrQX)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[20]])::id_extends));
      if (!((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[21]]).exists()) {
         try {
            ((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[22]]).createNewFile();
            Files.write(
               ((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[23]]).toPath(),
               new byte[booleans09f1f28026cd378cb9df490a64ac8f2a[3]]
            );
            rrFU.id_class();
         } catch (Exception var15) {
         }
      }

      return booleans09f1f28026cd378cb9df490a64ac8f2a[5];
   }

   private static void id_continue() {
      shorts09f1f28026cd378cb9df490a64ac8f2a = new short[]{
         3, 0, 0, 8, 8, 0, 0, 1, 5, 3, 4, 2, 6, 6, 3, 4, 5, 7, 3, 0, 0, 1, 1, 1, 8, 5, 3, 4, 6, 20, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0
      };
   }

   public rrwY_2 id_implements() {
      return (rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[35]];
   }

   private static void id_new() {
      strings09f1f28026cd378cb9df490a64ac8f2a = new String[]{
         new String("autocfg"), new String("autocfg"), new String("autocfg"), new String("autocfg"), new String("INSTANCE"), new String("start.celka")
      };
   }

   public rrwN_2 id_protected() {
      return (rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[37]];
   }

   public rrvT id_private() {
      return (rrvT)this.fields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[32]];
   }

   private static void id_final() {
      booleans09f1f28026cd378cb9df490a64ac8f2a = new boolean[]{
         false, false, false, false, false, true, false, false, false, true, true, false, false, false, true, false
      };
   }

   private static void id_volatile() {
      Object[] var0 = new Object[]{new rrQX(), new File("C:\\Celestial\\Beta 1.16.5\\start.celka"), false, null};
      var0[3] = new rrQX[]{(rrQX)var0[0]};
      staticFields09f1f28026cd378cb9df490a64ac8f2a = var0;
   }

   private void id_native() {
      if (this.fields09f1f28026cd378cb9df490a64ac8f2a == null) {
         this.fields09f1f28026cd378cb9df490a64ac8f2a = new Object[9];
      }
   }
}
