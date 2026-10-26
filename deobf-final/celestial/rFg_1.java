package celestial;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rFg_1 extends rFe_1 {
   private static final Logger protected_ = LogManager.getLogger();
   private boolean throws_;
   private final Socket case_;
   private final byte[] catch_ = new byte[1460];
   private final String private_;
   private final rFR implements_;

   rFg_1(rFR var1, String var2, Socket var3) {
      super("RCON Client " + var3.getInetAddress());
      this.implements_ = var1;
      this.case_ = var3;

      try {
         this.case_.setSoTimeout(0);
      } catch (Exception var5) {
         this.class_ = false;
      }

      this.private_ = var2;
   }

   @Override
   public void run() {
      try {
         while (this.class_) {
            BufferedInputStream var1 = new BufferedInputStream(this.case_.getInputStream());
            int var2 = var1.read(this.catch_, 0, 1460);
            if (10 > var2) {
               return;
            }

            int var3 = 0;
            int var4 = rFa_1.break_(this.catch_, 0, var2);
            if (var4 != var2 - 4) {
               return;
            }

            var3 += 4;
            int var5 = rFa_1.break_(this.catch_, var3, var2);
            var3 += 4;
            int var6 = rFa_1.class_(this.catch_, var3);
            var3 += 4;
            switch (var6) {
               case 2:
                  if (this.throws_) {
                     String var21 = rFa_1.class_(this.catch_, var3, var2);

                     try {
                        this.class_(var5, this.implements_.class_(var21));
                     } catch (Exception var14) {
                        this.class_(var5, "Error executing: " + var21 + " (" + var14.getMessage() + ")");
                     }
                     break;
                  }

                  this.protected_();
                  break;
               case 3:
                  String var7 = rFa_1.class_(this.catch_, var3, var2);
                  int var8 = var3 + var7.length();
                  if (!var7.isEmpty() && var7.equals(this.private_)) {
                     this.throws_ = true;
                     this.class_(var5, 2, "");
                     break;
                  }

                  this.throws_ = false;
                  this.protected_();
                  break;
               default:
                  this.class_(var5, String.format("Unknown request %s", Integer.toHexString(var6)));
            }
         }
      } catch (IOException var15) {
      } catch (Exception var16) {
         protected_.error("Exception whilst parsing RCON input", var16);
      } finally {
         this.throws_();
         protected_.info("Thread {} shutting down", this.break_);
         this.class_ = false;
      }
   }

   @Override
   public void class_() {
      this.class_ = false;
      this.throws_();
      super.class_();
   }

   private void class_(int var1, String var2) throws IOException {
      int var3 = var2.length();

      do {
         int var4 = 4096 <= var3 ? 4096 : var3;
         this.class_(var1, 0, var2.substring(0, var4));
         var2 = var2.substring(var4);
         var3 = var2.length();
      } while (0 != var3);
   }

   private void class_(int var1, int var2, String var3) throws IOException {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream(1248);
      DataOutputStream var5 = new DataOutputStream(var4);
      byte[] var6 = var3.getBytes(StandardCharsets.UTF_8);
      var5.writeInt(Integer.reverseBytes(var6.length + 10));
      var5.writeInt(Integer.reverseBytes(var1));
      var5.writeInt(Integer.reverseBytes(var2));
      var5.write(var6);
      var5.write(0);
      var5.write(0);
      this.case_.getOutputStream().write(var4.toByteArray());
   }

   private void throws_() {
      try {
         this.case_.close();
      } catch (IOException var2) {
         protected_.warn("Failed to close socket", var2);
      }
   }

   private void protected_() throws IOException {
      this.class_(-1, 2, "");
   }
}
