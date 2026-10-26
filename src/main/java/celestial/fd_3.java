/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.fH_2;
import celestial.fN_2;
import celestial.fo_3;
import celestial.rAL;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrJF;
import celestial.rrJL;
import celestial.rrJN;
import celestial.rrbb_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fd_3
extends fH_2 {
    private static final Logger id_finally = LogManager.getLogger();
    private final File id_extends;
    private final String id_native;
    private final boolean id_volatile;
    private final Runnable id_final;
    private CompletableFuture<?> id_package;
    private boolean id_int;
    public Boolean id_class = null;
    public boolean id_break = false;
    private boolean id_new = false;

    private void id_byte(fN_2 fN_22) {
        fo_3.id_class(this.id_new(), fN_22.id_class(), fN_22.id_break());
        fN_22.id_class(0, 0, 0, true);
        this.id_class = fN_22 != null;
    }

    public fd_3(File file, String string, rqO_2 rqO_22, boolean bl, Runnable runnable) {
        super(rqO_22);
        this.id_extends = file;
        this.id_native = string;
        this.id_volatile = bl;
        this.id_final = runnable;
    }

    private void id_class(fN_2 fN_22) {
        this.id_break(fN_22);
    }

    public Runnable id_class() {
        return this.id_final;
    }

    private fN_2 id_class(InputStream inputStream) {
        fN_2 fN_22 = null;
        try {
            fN_22 = fN_2.id_class(inputStream);
            if (this.id_volatile) {
                fN_22 = fd_3.id_protected(fN_22);
            }
        }
        catch (IOException iOException) {
            id_finally.warn("Error while loading the skin texture", (Throwable)iOException);
        }
        return fN_22;
    }

    private static void id_class(fN_2 fN_22, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        for (n6 = n; n6 < n3; ++n6) {
            for (n5 = n2; n5 < n4; ++n5) {
                int n7 = fN_22.id_class(n6, n5);
                if ((n7 >> 24 & 0xFF) >= 128) continue;
                return;
            }
        }
        for (n6 = n; n6 < n3; ++n6) {
            for (n5 = n2; n5 < n4; ++n5) {
                fN_22.id_class(n6, n5, fN_22.id_class(n6, n5) & 0xFFFFFF);
            }
        }
    }

    private void id_break(fN_2 fN_22) {
        if (this.id_final != null) {
            this.id_final.run();
        }
        QY.id_instanceof().execute(() -> {
            this.id_int = true;
            if (!RenderSystem.isOnRenderThread()) {
                RenderSystem.recordRenderCall(() -> this.id_byte(fN_22));
            } else {
                this.id_byte(fN_22);
            }
        });
    }

    private static void id_break(fN_2 fN_22, int n, int n2, int n3, int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                fN_22.id_class(i, j, fN_22.id_class(i, j) | 0xFF000000);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void id_throws() {
        try {
            fN_2 fN_22;
            rrJF rrJF2 = rrJN.id_class(this.id_native, QY.id_instanceof().W());
            rrJL rrJL2 = rrJN.id_class(rrJF2);
            if (rrJL2.id_class() / 100 != 2) {
                return;
            }
            byte[] byArray = rrJL2.id_protected();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            if (this.id_extends != null) {
                FileUtils.copyInputStreamToFile((InputStream)byteArrayInputStream, (File)this.id_extends);
                fN_22 = fN_2.id_class(new FileInputStream(this.id_extends));
            } else {
                fN_22 = fN_2.id_class(byteArrayInputStream);
            }
            this.id_class(fN_22);
            this.id_new = true;
        }
        catch (Exception exception) {
            id_finally.error("Couldn't download http texture: " + exception.getClass().getName() + ": " + exception.getMessage());
            return;
        }
        finally {
            this.id_case();
        }
    }

    private Executor id_catch() {
        return this.id_native.startsWith("http://s.optifine.net") ? rqR_2.id_volatile() : rqR_2.id_case();
    }

    private void id_case() {
    }

    private static fN_2 id_protected(fN_2 fN_22) {
        boolean bl;
        boolean bl2 = bl = fN_22.id_break() == 32;
        if (bl) {
            fN_2 fN_23 = new fN_2(64, 64, true);
            fN_23.id_class(fN_22);
            fN_22.close();
            fN_22 = fN_23;
            fN_23.id_class(0, 32, 64, 32, 0);
            fN_23.id_class(4, 16, 16, 32, 4, 4, true, false);
            fN_23.id_class(8, 16, 16, 32, 4, 4, true, false);
            fN_23.id_class(0, 20, 24, 32, 4, 12, true, false);
            fN_23.id_class(4, 20, 16, 32, 4, 12, true, false);
            fN_23.id_class(8, 20, 8, 32, 4, 12, true, false);
            fN_23.id_class(12, 20, 16, 32, 4, 12, true, false);
            fN_23.id_class(44, 16, -8, 32, 4, 4, true, false);
            fN_23.id_class(48, 16, -8, 32, 4, 4, true, false);
            fN_23.id_class(40, 20, 0, 32, 4, 12, true, false);
            fN_23.id_class(44, 20, -8, 32, 4, 12, true, false);
            fN_23.id_class(48, 20, -16, 32, 4, 12, true, false);
            fN_23.id_class(52, 20, -8, 32, 4, 12, true, false);
        }
        fd_3.id_break(fN_22, 0, 0, 32, 16);
        if (bl) {
            fd_3.id_class(fN_22, 32, 0, 64, 32);
        }
        fd_3.id_break(fN_22, 0, 16, 64, 32);
        fd_3.id_break(fN_22, 16, 48, 48, 64);
        return fN_22;
    }

    private boolean id_protected() {
        if (!this.id_break) {
            return false;
        }
        Proxy proxy = QY.id_instanceof().W();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            return false;
        }
        return this.id_native.startsWith("http://");
    }

    @Override
    public void a_(rAL rAL2) throws IOException {
        QY.id_instanceof().execute(() -> {
            if (!this.id_int) {
                try {
                    super.a_(rAL2);
                }
                catch (IOException iOException) {
                    id_finally.warn("Failed to load texture: {}", (Object)this.id_byte, (Object)iOException);
                }
                this.id_int = true;
            }
        });
        if (this.id_package == null) {
            fN_2 fN_22;
            if (this.id_extends != null && this.id_extends.isFile()) {
                id_finally.debug("Loading http texture from local cache ({})", (Object)this.id_extends);
                FileInputStream fileInputStream = new FileInputStream(this.id_extends);
                fN_22 = this.id_class(fileInputStream);
            } else {
                fN_22 = null;
            }
            if (fN_22 != null) {
                this.id_class(fN_22);
                this.id_case();
            } else {
                this.id_package = CompletableFuture.runAsync(() -> {
                    HttpURLConnection httpURLConnection = null;
                    id_finally.debug("Downloading http texture from {} to {}", (Object)this.id_native, (Object)this.id_extends);
                    if (this.id_protected()) {
                        this.id_throws();
                    } else {
                        try {
                            InputStream inputStream;
                            httpURLConnection = (HttpURLConnection)new URL(this.id_native).openConnection(QY.id_instanceof().W());
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setDoOutput(false);
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() / 100 != 2) {
                                if (httpURLConnection.getErrorStream() != null) {
                                    rrbb_3.id_byte(httpURLConnection.getErrorStream());
                                }
                                return;
                            }
                            if (this.id_extends != null) {
                                FileUtils.copyInputStreamToFile((InputStream)httpURLConnection.getInputStream(), (File)this.id_extends);
                                inputStream = new FileInputStream(this.id_extends);
                            } else {
                                inputStream = httpURLConnection.getInputStream();
                            }
                            QY.id_instanceof().execute(() -> {
                                fN_2 fN_22 = this.id_class(inputStream);
                                if (fN_22 != null) {
                                    this.id_class(fN_22);
                                    this.id_case();
                                }
                            });
                            this.id_new = true;
                        }
                        catch (Exception exception) {
                            id_finally.error("Couldn't download http texture", (Throwable)exception);
                            return;
                        }
                        finally {
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.id_case();
                        }
                    }
                }, this.id_catch());
            }
        }
    }
}

