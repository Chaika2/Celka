package celestial;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class rrJu_1 {
   private String byte_ = null;
   private int protected_ = 0;
   private Proxy throws_ = Proxy.NO_PROXY;
   private List<rrJZ> case_ = new LinkedList<>();
   private List<rrJZ> catch_ = new LinkedList<>();
   private Socket private_ = null;
   private InputStream implements_ = null;
   private OutputStream finally_ = null;
   private rrJv_1 extends_ = null;
   private rrJm_1 native_ = null;
   private int volatile_ = 0;
   private boolean final_ = false;
   private long package_ = 5000L;
   private int int_ = 1000;
   private long new_ = System.currentTimeMillis();
   private boolean continue_ = false;
   private static final String super_ = "\n";
   public static final int class_ = 5000;
   public static final int break_ = 5000;
   private static final Pattern this_ = Pattern.compile("^[a-zA-Z]+://.*");

   public synchronized rrJZ byte_() throws InterruptedException, IOException {
      if (this.catch_.size() <= 0 && this.finally_ != null) {
         this.finally_.flush();
      }

      return this.class_(this.catch_, true);
   }

   public rrJu_1(String var1, int var2) {
      this(var1, var2, Proxy.NO_PROXY);
   }

   public rrJu_1(String var1, int var2, Proxy var3) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.extends_ = new rrJv_1(this);
      this.extends_.start();
      this.native_ = new rrJm_1(this);
      this.native_.start();
   }

   private String[] class_(String var1, char var2) {
      int var3 = var1.indexOf(var2);
      if (var3 < 0) {
         return new String[]{var1};
      } else {
         String var4 = var1.substring(0, var3);
         String var5 = var1.substring(var3 + 1);
         return new String[]{var4, var5};
      }
   }

   private void class_(rrJL var1) {
      String var2 = var1.class_("Connection");
      if (var2 != null && !var2.toLowerCase().equals("keep-alive")) {
         this.class_(new EOFException("Connection not keep-alive"));
      }

      String var3 = var1.class_("Keep-Alive");
      if (var3 != null) {
         String[] var4 = rrbb_3.class_(var3, ",;");

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            String[] var7 = this.class_(var6, '=');
            if (var7.length >= 2) {
               if (var7[0].equals("timeout")) {
                  int var8 = rrbb_3.class_(var7[1], -1);
                  if (var8 > 0) {
                     this.package_ = (long)(var8 * 1000);
                  }
               }

               if (var7[0].equals("max")) {
                  int var9 = rrbb_3.class_(var7[1], -1);
                  if (var9 > 0) {
                     this.int_ = var9;
                  }
               }
            }
         }
      }
   }

   public synchronized boolean class_(rrJZ var1) {
      if (this.throws_()) {
         return false;
      } else {
         this.class_(var1, this.case_);
         this.class_(var1, this.catch_);
         this.volatile_++;
         return true;
      }
   }

   public synchronized void class_(rrJZ var1, rrJL var2) {
      if (!this.continue_) {
         this.final_ = true;
         this.native_();
         if (this.case_.size() <= 0 || this.case_.get(0) != var1) {
            throw new IllegalArgumentException("Response out of order: " + var1);
         }

         this.case_.remove(0);
         var1.class_(true);
         String var3 = var2.class_("Location");
         if (var2.class_() / 100 == 3 && var3 != null && var1.class_().private_() < 5) {
            try {
               var3 = this.class_(var3, var1.class_());
               rrJF var8 = rrJN.class_(var3, var1.class_().implements_());
               var8.class_(var1.class_().private_() + 1);
               rrJZ var5 = new rrJZ(var8, var1.break_());
               rrJN.class_(var5);
            } catch (IOException var6) {
               var1.break_().class_(var1.class_(), var6);
            }
         } else {
            rrJQ var4 = var1.break_();
            var4.class_(var1.class_(), var2);
         }

         this.class_(var2);
      }
   }

   public synchronized void class_(rrJZ var1, Exception var2) {
      this.class_(var2);
   }

   private synchronized void class_(Exception var1) {
      if (!this.continue_) {
         this.continue_ = true;
         this.break_(var1);
         if (this.extends_ != null) {
            this.extends_.interrupt();
         }

         if (this.native_ != null) {
            this.native_.interrupt();
         }

         try {
            if (this.private_ != null) {
               this.private_.close();
            }
         } catch (IOException var3) {
         }

         this.private_ = null;
         this.implements_ = null;
         this.finally_ = null;
      }
   }

   private String class_(String var1, rrJF var2) {
      if (this_.matcher(var1).matches()) {
         return var1;
      } else if (var1.startsWith("//")) {
         return "http:" + var1;
      } else {
         String var3 = var2.class_();
         if (var2.break_() != 80) {
            var3 = var3 + ":" + var2.break_();
         }

         if (var1.startsWith("/")) {
            return "http://" + var3 + var1;
         } else {
            String var4 = var2.protected_();
            int var5 = var4.lastIndexOf("/");
            return var5 >= 0 ? "http://" + var3 + var4.substring(0, var5 + 1) + var1 : "http://" + var3 + "/" + var1;
         }
      }
   }

   public synchronized void class_(Socket var1) throws IOException {
      if (!this.continue_) {
         if (this.private_ != null) {
            throw new IllegalArgumentException("Already connected");
         }

         this.private_ = var1;
         this.private_.setTcpNoDelay(true);
         this.implements_ = this.private_.getInputStream();
         this.finally_ = new BufferedOutputStream(this.private_.getOutputStream());
         this.native_();
         this.notifyAll();
      }
   }

   private void class_(rrJZ var1, List<rrJZ> var2) {
      var2.add(var1);
      this.notifyAll();
   }

   private rrJZ class_(List<rrJZ> var1, boolean var2) throws InterruptedException {
      while (var1.size() <= 0) {
         this.extends_();
         this.wait(1000L);
      }

      this.native_();
      return var2 ? (rrJZ)var1.remove(0) : (rrJZ)var1.get(0);
   }

   public synchronized OutputStream class_() throws IOException, InterruptedException {
      while (this.finally_ == null) {
         this.extends_();
         this.wait(1000L);
      }

      return this.finally_;
   }

   public synchronized void break_(rrJZ var1, Exception var2) {
      this.class_(var2);
   }

   public synchronized InputStream break_() throws IOException, InterruptedException {
      while (this.implements_ == null) {
         this.extends_();
         this.wait(1000L);
      }

      return this.implements_;
   }

   public synchronized void break_(rrJZ var1) {
      if (!this.continue_) {
         this.native_();
      }
   }

   private void break_(Exception var1) {
      if (this.case_.size() > 0) {
         if (!this.final_) {
            rrJZ var2 = this.case_.remove(0);
            var2.break_().class_(var2.class_(), var1);
            var2.class_(true);
         }

         while (this.case_.size() > 0) {
            rrJZ var3 = this.case_.remove(0);
            rrJN.class_(var3);
         }
      }
   }

   public synchronized boolean throws_() {
      return this.continue_ ? true : this.volatile_ >= this.int_;
   }

   public Proxy finally_() {
      return this.throws_;
   }

   public synchronized boolean catch_() {
      return this.case_.size() > 0;
   }

   private void extends_() {
      if (this.private_ != null) {
         long var1 = this.package_;
         if (this.case_.size() > 0) {
            var1 = 5000L;
         }

         long var3 = System.currentTimeMillis();
         if (var3 > this.new_ + var1) {
            this.class_(new InterruptedException("Timeout " + var1));
         }
      }
   }

   public int case_() {
      return this.volatile_;
   }

   public int implements_() {
      return this.protected_;
   }

   public synchronized rrJZ protected_() throws InterruptedException {
      return this.class_(this.case_, false);
   }

   public String private_() {
      return this.byte_;
   }

   private void native_() {
      this.new_ = System.currentTimeMillis();
   }
}
