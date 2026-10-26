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
   ;
   public Object[] fields09f1f28026cd378cb9df490a64ac8f2a;
   private static byte[] bytes09f1f28026cd378cb9df490a64ac8f2a;
   private static short[] shorts09f1f28026cd378cb9df490a64ac8f2a;
   private static String[] strings09f1f28026cd378cb9df490a64ac8f2a;
   private static boolean[] booleans09f1f28026cd378cb9df490a64ac8f2a;
   public static Object[] staticFields09f1f28026cd378cb9df490a64ac8f2a;

   public ClickGuiScreen byte_() {
      return (ClickGuiScreen)this.fields09f1f28026cd378cb9df490a64ac8f2a[7];
   }

   private static void int_() {
      bytes09f1f28026cd378cb9df490a64ac8f2a = new byte[]{2, 3, 24, 9, 4, 2};
   }

   private rrQX() {
      this.native_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7213762120603438659L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1312094857;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, -48, 11, -46, -56, 110, -82, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrvV class_() {
      return (rrvV)this.fields09f1f28026cd378cb9df490a64ac8f2a[2];
   }

   public ConfigManager break_() {
      return (ConfigManager)this.fields09f1f28026cd378cb9df490a64ac8f2a[0];
   }

   public rrwe_3 throws_() {
      return (rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[5];
   }

   public OA finally_() {
      return (OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[8];
   }

   public rrIJ catch_() {
      return (rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[3];
   }

   public void extends_() {
      ((OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[8]).class_(rrLM.class_());
      ((rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[5]).catch_();
      ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[3]).byte_("autocfg", false);
      ((rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[4]).byte_("autocfg", false);
      ((rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[6]).class_();
      ((Qw_1)import_.class_[20]).break_();
      ((rrZP)rrZP.staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[0]).class_();
   }

   public boolean case_() {
      ((rruc_1)rruc_1.staticFields8976bba2dba834c8b8aad687eeef9d7a[0]).break_();
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).volatile_();
      OC var6 = new OC();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[8] = var6;
      ((OA)this.fields09f1f28026cd378cb9df490a64ac8f2a[8])
         .class_(this.getClass().getPackageName(), (var0, var1) -> (Lookup)var0.invoke(null, var1, MethodHandles.lookup()));
      ((rrZP)rrZP.staticFieldsfda1a12b8e6d3a64af93b1c14ed22523[0]).break_();
      rrjC_2.break_();
      C_throws.class_().break_();
      ConfigManager var7 = new ConfigManager();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[0] = var7;
      rrvT var8 = new rrvT();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[1] = var8;
      rrwe_3 var9 = new rrwe_3();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[5] = var9;
      rrIJ var10 = new rrIJ();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[3] = var10;
      rrwY_2 var11 = new rrwY_2();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[4] = var11;
      rrvV var12 = new rrvV();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[2] = var12;
      rrwN_2 var13 = new rrwN_2();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[6] = var13;
      ((rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[6]).break_();
      ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[3]).class_("autocfg", false);
      ((rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[4]).break_(false);
      ((rrwe_3)this.fields09f1f28026cd378cb9df490a64ac8f2a[5]).byte_();
      ClickGuiScreen var14 = new ClickGuiScreen();
      this.fields09f1f28026cd378cb9df490a64ac8f2a[7] = var14;
      ((rrIJ)this.fields09f1f28026cd378cb9df490a64ac8f2a[3]).class_("autocfg", false);
      rrjC_2.protected_().class_(rrjC_2.protected_().class_());
      ((rrwq_3)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[0]).byte_();
      new rrCS();
      Runtime.getRuntime().addShutdownHook(new Thread(((rrQX)staticFields09f1f28026cd378cb9df490a64ac8f2a[0])::extends_));
      if (!((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[1]).exists()) {
         try {
            ((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[22]]).createNewFile();
            Files.write(
               ((File)staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts09f1f28026cd378cb9df490a64ac8f2a[23]]).toPath(),
               new byte[booleans09f1f28026cd378cb9df490a64ac8f2a[3]]
            );
            rrFU.class_();
         } catch (Exception var15) {
         }
      }

      return booleans09f1f28026cd378cb9df490a64ac8f2a[5];
   }

   private static void continue_() {
      shorts09f1f28026cd378cb9df490a64ac8f2a = new short[]{
         3, 0, 0, 8, 8, 0, 0, 1, 5, 3, 4, 2, 6, 6, 3, 4, 5, 7, 3, 0, 0, 1, 1, 1, 8, 5, 3, 4, 6, 20, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0
      };
   }

   public rrwY_2 implements_() {
      return (rrwY_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[4];
   }

   private static void new_() {
      strings09f1f28026cd378cb9df490a64ac8f2a = new String[]{
         new String("autocfg"), new String("autocfg"), new String("autocfg"), new String("autocfg"), new String("INSTANCE"), new String("start.celka")
      };
   }

   public rrwN_2 protected_() {
      return (rrwN_2)this.fields09f1f28026cd378cb9df490a64ac8f2a[6];
   }

   public rrvT private_() {
      return (rrvT)this.fields09f1f28026cd378cb9df490a64ac8f2a[1];
   }

   private static void final_() {
      booleans09f1f28026cd378cb9df490a64ac8f2a = new boolean[]{
         false, false, false, false, false, true, false, false, false, true, true, false, false, false, true, false
      };
   }

   private static void volatile_() {
      Object[] var0 = new Object[]{new rrQX(), new File("C:\\Celestial\\Beta 1.16.5\\start.celka"), false, null};
      var0[3] = new rrQX[]{(rrQX)var0[0]};
      staticFields09f1f28026cd378cb9df490a64ac8f2a = var0;
   }

   private void native_() {
      if (this.fields09f1f28026cd378cb9df490a64ac8f2a == null) {
         this.fields09f1f28026cd378cb9df490a64ac8f2a = new Object[9];
      }
   }
}
