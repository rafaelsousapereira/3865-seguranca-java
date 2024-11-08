package med.voll.web_application.infra.exception.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ConfiguracoesSeguranca {

    @Bean
    public UserDetailsService dadosUsuarioCadastrado() {
        var usuario1 = User.builder().username("joao@mail.com").password("{noop}joao123").build();
        var usuario2 = User.builder().username("maria@mail.com").password("{noop}maria123").build();

        return new InMemoryUserDetailsManager(usuario1, usuario2);
    }
}
