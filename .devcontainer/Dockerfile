# Usar imagen base con Oracle JDK 17
FROM --platform=linux/amd64 ubuntu:25.04

# Instalar dependencias necesarias
RUN apt update -y && \
    apt install -y \
    git \
    curl \
    zsh \
    rpm \
    make

# Descargar e instalar Oracle JDK
RUN apt install -y openjdk-21-jdk

# Establecer JAVA_HOME y agregarlo a PATH
RUN echo "export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))" >> ~/.zshrc && \
    echo "export PATH=\$JAVA_HOME/bin:\$PATH" >> ~/.zshrc

# Instalar Oh My Zsh y plugins
RUN sh -c "$(curl -fsSL https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh)" "" --unattended && \
    git clone https://github.com/zsh-users/zsh-syntax-highlighting.git ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-syntax-highlighting && \
    git clone https://github.com/zsh-users/zsh-autosuggestions ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-autosuggestions && \
    sed -i 's/plugins=(git)/plugins=(git zsh-syntax-highlighting zsh-autosuggestions)/' ~/.zshrc && \
    sed -i 's/ZSH_THEME="robbyrussell"/ZSH_THEME="xiong-chiamiov-plus"/' ~/.zshrc

# Cambiar shell predeterminado a Zsh
SHELL ["/bin/zsh", "-c"]

# Crear y establecer directorio de trabajo
WORKDIR /workspace

# Copiar archivos del proyecto
COPY . /workspace

# Exponer el puerto 8080 para Spring Boot
EXPOSE 8080

# Comando predeterminado
CMD ["zsh"]
